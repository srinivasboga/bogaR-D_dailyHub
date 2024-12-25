package com.getrosoft.teleport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/example")
	public String example(Model model) {
		model.addAttribute("message", "Hello, World!");
		return "example";
	}
}
