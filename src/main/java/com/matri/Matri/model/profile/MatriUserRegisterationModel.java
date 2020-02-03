package com.matri.Matri.model.profile;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "matri_user_registration")
@Entity
public class MatriUserRegisterationModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matri_user_registration_gen")
	@SequenceGenerator(name = "matri_user_registration_gen", sequenceName = "matri_user_registration_seq")
	private Long seq;
	private String profileId;
	private String profileFor;
	private String name;
	private String gender;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private String religion;
	private Long mobileNum;
	private String email;
	private String password;

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getProfileFor() {
		return profileFor;
	}

	public void setProfileFor(String profileFor) {
		this.profileFor = profileFor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
