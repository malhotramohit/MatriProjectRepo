package com.matri.Matri.clientprofile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matri.Matri.base.bean.HomeBean;
import com.matri.Matri.service.profile.UserRegistrationService;

@Controller
@RequestMapping("/profile")
public class UserRegistrationController {

	private UserRegistrationService userRegistrationService;

	public UserRegistrationController(UserRegistrationService userRegistrationService) {
		this.userRegistrationService = userRegistrationService;
	}

	@RequestMapping("/registeruser.do")
	public String registerUser(@ModelAttribute("homeBean") HomeBean homeBean) {
		userRegistrationService.registerUser(homeBean.getMatriUserRegisterationModel());
		return "createremainingprofile";
	}

	@RequestMapping("/completeprofile.do")
	public String showCompleteProfilePage() {
		return "createremainingprofile";
	}

}
