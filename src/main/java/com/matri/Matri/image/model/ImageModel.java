package com.matri.Matri.image.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seq;

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

}
