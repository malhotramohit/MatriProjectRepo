package com.matri.Matri.controller.profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matri.Matri.bean.base.HomeBean;
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
