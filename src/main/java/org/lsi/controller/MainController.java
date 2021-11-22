package org.lsi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

	@GetMapping("/")
	public String showIndex() {
		
		return"index.html";
	}
	
	@GetMapping("/infos")
	public String showSchools() {
		
		return"infos.html";
	}
}
