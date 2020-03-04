package com.matri.Matri.image.service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.matri.Matri.image.configuration.ImageUploadProperties;
import com.matri.Matri.image.contants.ImageConstants;
import com.matri.Matri.image.exception.FileStorageException;

@Service
public class ImageServiceImpl implements ImageService {

	private static final Logger logger = LoggerFactory.getLogger(ImageServiceImpl.class);

	private final String basePathStrForImageToUploadForProfiles;

	@Autowired
	public ImageServiceImpl(ImageUploadProperties imageUploadProperties) {

		this.basePathStrForImageToUploadForProfiles = imageUploadProperties.getUploadImageDir();

		Path basePathForImageToUploadForProfiles = Paths.get(basePathStrForImageToUploadForProfiles).toAbsolutePath()
				.normalize();

		try {
			Files.createDirectories(basePathForImageToUploadForProfiles);
		} catch (Exception ex) {
			throw new FileStorageException("Could not create the directory where the uploaded files will be stored.",
					ex);
		}

		logger.info("Path for directory :: " + basePathForImageToUploadForProfiles);
	}

	public String storeFile(MultipartFile file, String profileId) {
		// Normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}

			// create path
			String finalPathStrforImageForProfile = basePathStrForImageToUploadForProfiles
					+ ImageConstants.DIRECTORY_SEP + profileId;

			Path finalPathforImageForProfile = Paths.get(finalPathStrforImageForProfile).toAbsolutePath().normalize();
			// create directory
			try {
				Files.createDirectories(finalPathforImageForProfile);
			} catch (Exception ex) {
				throw new FileStorageException(
						"Could not create the directory where the uploaded files will be stored.", ex);
			}

			// Copy file to the target location (Replacing existing file with the same name)
			Path targetLocation = finalPathforImageForProfile.resolve(fileName);
			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

			return fileName;
		} catch (IOException ex) {
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	public Resource loadFileAsResource(String profileId) {
		try {
			String finalPathStrforImageForProfile = basePathStrForImageToUploadForProfiles
					+ ImageConstants.DIRECTORY_SEP + profileId;

			File folder = new File(finalPathStrforImageForProfile);
			File[] listOfFiles = folder.listFiles();

			for (File file : listOfFiles) {
				if (file.isFile()) {
					System.out.println(file.getName());
				}
			}
			finalPathStrforImageForProfile = finalPathStrforImageForProfile.concat("/" + listOfFiles[0].getName());
			Path finalPathforImageForProfile = Paths
					.get(finalPathStrforImageForProfile).toAbsolutePath()
					.normalize();

			UrlResource resource = new UrlResource(finalPathforImageForProfile.toUri());
			if (resource.exists()) {
				return (Resource) resource;
			} else {
				throw new MyFileNotFoundException("File not found " + profileId);
			}
		} catch (MalformedURLException ex) {
			throw new MyFileNotFoundException("File not found " + profileId, ex);
		}
	}
}
