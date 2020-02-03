package com.matri.Matri.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nav")
public class NavigationController {



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

}
