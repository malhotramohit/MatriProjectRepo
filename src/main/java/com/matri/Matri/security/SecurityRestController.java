package com.matri.Matri.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityRestController {
	
	@GetMapping("/CheckRest")
	public String checkRest()
	{
		
		return "YES + CheckingRestController";
		
	}
	
}
