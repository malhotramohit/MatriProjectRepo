package com.matri.Matri.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matri.Matri.base.bean.NavigationBean;

@Controller
@RequestMapping("/nav")
public class NavigationController {

	private NavigationBean navigationBean;

	public NavigationController(NavigationBean navigationBean) {
		super();
		this.navigationBean = navigationBean;
	}

	@RequestMapping("/search.do")
	public String showSearchPage() {
		return "search";
	}

	@RequestMapping("/about.do")
	public String showAboutPage() {
		return "about";
	}

	@RequestMapping("/app.do")
	public String showAppPage() {
		return "app";
	}

	@RequestMapping("/contact.do")
	public String showContactPage() {
		return "contact";
	}

	@RequestMapping("/groom_profile.do")
	public String showGroomProfilePage(Model model) {
		model.addAttribute("imageModels", navigationBean.loadAllImagesByProfileId("MohitMalhotra-P123"));

		return "groom_profile";
	}

	@RequestMapping("/bride_profile.do")
	public String showBrideProfilePage() {
		return "bride_profile";
	}

}
