package com.matri.Matri.image.rest.contoller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.matri.Matri.image.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageRestController {

	private ImageService imageService;

	public ImageRestController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}

	// Handling file upload request
	@PostMapping("/uploadimage.do")
	public ResponseEntity<Object> imageUpload(@RequestParam("image") MultipartFile file) throws IOException {

		// Save file on system
		if (!file.getOriginalFilename().isEmpty()) {
			imageService.storeFile(file, "MohitMalhotra-P123");
		} else {
			return new ResponseEntity<>("Invalid file.", HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>("File Uploaded Successfully.", HttpStatus.OK);
	}

}
