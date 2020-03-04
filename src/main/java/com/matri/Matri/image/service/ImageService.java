package com.matri.Matri.image.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	String storeFile(MultipartFile file, String profileId);

}
