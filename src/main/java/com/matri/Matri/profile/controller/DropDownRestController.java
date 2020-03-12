package com.matri.Matri.profile.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matri.Matri.profile.dto.SelectOptionDto;

@RestController
public class DropDownRestController {

	@GetMapping("/v1/api/dd/religion")
	public List<SelectOptionDto> getReligionDD() {
		List<SelectOptionDto> religionDtos = new ArrayList<SelectOptionDto>();
		religionDtos.add(new SelectOptionDto("Hindu", "Hindu"));
		religionDtos.add(new SelectOptionDto("Muslim", "Muslim"));
		return religionDtos;
	}

}
