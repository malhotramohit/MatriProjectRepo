package com.matri.Matri.image.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ImageModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seq;

	private String imageName;

	@Transient
	private String imageUrlStr;

	public ImageModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImageModel(String imageName, String imageUrlStr) {
		super();
		this.imageName = imageName;
		this.imageUrlStr = imageUrlStr;
	}

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageUrlStr() {
		return imageUrlStr;
	}

	public void setImageUrlStr(String imageUrlStr) {
		this.imageUrlStr = imageUrlStr;
	}

}
