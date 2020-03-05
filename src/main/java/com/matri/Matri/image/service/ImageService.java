package com.matri.Matri.image.service;

import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.matri.Matri.image.model.ImageModel;

public interface ImageService {

	String storeFile(MultipartFile file, String profileId);

	Resource loadFileAsResource(String fileName, String imageName);

	List<ImageModel> loadAllImagesByProfileId(String profileId);

}
