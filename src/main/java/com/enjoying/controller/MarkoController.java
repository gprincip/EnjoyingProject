package com.enjoying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MarkoController {
	@RequestMapping(value="/helloMarko", method=RequestMethod.GET)
	public String sayHelloMarko(ModelMap model)
	{	
		model.addAttribute("message","Hello from Marko!");
		return "helloMarko";
	}
}
