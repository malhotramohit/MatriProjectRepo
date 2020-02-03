package com.matri.Matri.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matri.Matri.bean.base.HomeBean;

@Controller
public class HomeController {

	private HomeBean homeBean;

	public HomeController(HomeBean homeBean) {
		this.homeBean = homeBean;
	}

	@RequestMapping("/")
	public String showSearchPage(Model model) {
		model.addAttribute("homeBean", homeBean);
		return "index";
	}
}
