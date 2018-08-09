package com.enjoying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerGavrilo {

	@RequestMapping(path = "/cont1", method = {RequestMethod.GET})
	public String cont1(Model model) {
		
		model.addAttribute("attrib", "Hello world");
		return "test1";
	}
	
}
