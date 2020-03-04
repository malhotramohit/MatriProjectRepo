package com.matri.Matri.image.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	String storeFile(MultipartFile file, String profileId);

	Resource loadFileAsResource(String fileName);

}
