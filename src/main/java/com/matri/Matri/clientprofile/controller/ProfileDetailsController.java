package com.matri.Matri.clientprofile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matri.Matri.clientprofile.bean.ProfileDetailsBean;

@Controller
@RequestMapping("/profile/details")
public class ProfileDetailsController {

	private ProfileDetailsBean profileDetailsBean;

	public ProfileDetailsController(ProfileDetailsBean profileDetailsBean) {
		this.profileDetailsBean = profileDetailsBean;
	}

	public String showProfilePage(@RequestParam("profileId") String profileId) {

		return "";
	}
}
