package com.matri.Matri.image.rest.contoller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.matri.Matri.image.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageRestController {

	private static final Logger logger = LoggerFactory.getLogger(ImageRestController.class);

	private ImageService imageService;

	public ImageRestController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}

	// Handling file upload request
	@PostMapping("/uploadimage.do")
	public ResponseEntity<Object> imageUpload(@RequestParam("ssi-upload") MultipartFile file) throws IOException {

		// Save file on system
		if (!file.getOriginalFilename().isEmpty()) {
			imageService.storeFile(file, "MohitMalhotra-P123");
		} else {
			return new ResponseEntity<>("Invalid file.", HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>("File Uploaded Successfully.", HttpStatus.OK);
	}

	@GetMapping("/downloadFile/{folderName}/{imageName}")
	public ResponseEntity<Resource> downloadFile(@PathVariable("folderName") String folderName,
			@PathVariable("imageName") String imageName, HttpServletRequest request) {
		// Load file as Resource
		Resource resource = imageService.loadFileAsResource(folderName, imageName);

		// Try to determine file's content type
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException ex) {
			logger.info("Could not determine file type.");
		}

		// Fallback to the default content type if type could not be determined
		if (contentType == null) {
			contentType = "application/octet-stream";
		}

		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}

}
