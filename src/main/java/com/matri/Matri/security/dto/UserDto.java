package com.matri.Matri.security.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.matri.Matri.security.validation.PasswordMatches;
import com.matri.Matri.security.validation.ValidEmail;
import com.matri.Matri.security.validation.ValidPassword;

@PasswordMatches
public class UserDto {

	@NotNull
	@Size(min = 1, message = "{Size.userDto.profileFor}")
	private String profileFor;

	@NotNull
	@Size(min = 1, message = "{Size.userDto.Name}")
	private String name;

	@NotNull
	@Size(min = 1, message = "{Size.userDto.gender}")
	private String gender;

	private Date dateOfBirth;

	private String religion;
	private Long mobileNum;

	@ValidPassword
	private String passwordForReg;

	@NotNull
	@Size(min = 1)
	private String matchingPassword;

	@ValidEmail
	@NotNull
	@Size(min = 1, message = "{Size.userDto.email}")
	private String email;

	private boolean isUsing2FA;

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	private Integer role;

	public Integer getRole() {
		return role;
	}

	public void setRole(final Integer role) {
		this.role = role;
	}

	public String getProfileFor() {
		return profileFor;
	}

	public void setProfileFor(String profileFor) {
		this.profileFor = profileFor;
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

	

	public String getPasswordForReg() {
		return passwordForReg;
	}

	public void setPasswordForReg(String passwordForReg) {
		this.passwordForReg = passwordForReg;
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(final String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}

	public boolean isUsing2FA() {
		return isUsing2FA;
	}

	public void setUsing2FA(boolean isUsing2FA) {
		this.isUsing2FA = isUsing2FA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserDto [profileFor=" + profileFor + ", name=" + name + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", religion=" + religion + ", mobileNum=" + mobileNum + ", passwordForReg=" + passwordForReg
				+ ", matchingPassword=" + matchingPassword + ", email=" + email + ", isUsing2FA=" + isUsing2FA
				+ ", role=" + role + "]";
	}

	// @Override
	// public String toString() {
	// final StringBuilder builder = new StringBuilder();
	// builder.append("UserDto [firstName=").append(firstName).append(",
	// lastName=").append(lastName)
	// .append(", password=").append(password).append(",
	// matchingPassword=").append(matchingPassword)
	// .append(", email=").append(email).append(",
	// isUsing2FA=").append(isUsing2FA).append(", role=")
	// .append(role).append("]");
	// return builder.toString();
	// }

}
