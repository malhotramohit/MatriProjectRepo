package com.matri.Matri.image.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class ImageUploadProperties {

	private String uploadImageDir;

	public String getUploadImageDir() {
		return uploadImageDir;
	}

	public void setUploadImageDir(String uploadImageDir) {
		this.uploadImageDir = uploadImageDir;
	}

}
