package com.matri.Matri.match.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchController {

	@GetMapping("/api/match/profiles.do")
	public String getMatchedProfiles() {
		return "nri_list";
	}

}
