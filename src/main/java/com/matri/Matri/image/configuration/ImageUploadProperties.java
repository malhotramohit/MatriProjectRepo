package com.matri.Matri.image.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class ImageUploadProperties {

	private String uploadImageDir;

	private String downloadImageUrl;

	public String getDownloadImageUrl() {
		return downloadImageUrl;
	}

	public void setDownloadImageUrl(String downloadImageUrl) {
		this.downloadImageUrl = downloadImageUrl;
	}

	public String getUploadImageDir() {
		return uploadImageDir;
	}

	public void setUploadImageDir(String uploadImageDir) {
		this.uploadImageDir = uploadImageDir;
	}

}
