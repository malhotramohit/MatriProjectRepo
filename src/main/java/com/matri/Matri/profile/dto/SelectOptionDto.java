package com.matri.Matri.profile.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SelectOptionDto {

	@JsonIgnore
	private Long seq;
	private Object name;
	private Object value;

	public SelectOptionDto() {
		super();
	}

	public SelectOptionDto(Object name, Object value) {
		super();
		this.name = name;
		this.value = value;
	}

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public Object getName() {
		return name;
	}

	public void setName(Object name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
