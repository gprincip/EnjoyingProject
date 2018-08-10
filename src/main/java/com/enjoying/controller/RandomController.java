package com.enjoying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomController {

	
	@RequestMapping(value="/random")
	public String Random(Model model) {
		
		model.addAttribute("message", "Helloo everyone !");
		
		return "random";
	}
}
