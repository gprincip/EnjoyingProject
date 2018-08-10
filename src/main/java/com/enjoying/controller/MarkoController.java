package com.enjoying.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.enjoying.jpa.StudentRepository;
import com.enjoying.model.Student;

@Controller
public class MarkoController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping(value="/helloMarko", method=RequestMethod.GET)
	public String sayHelloMarko(ModelMap model)
	{	
		
		studentRepository.save(new Student("Pera","12345"));
		System.out.println(studentRepository.findAll());
		
		model.addAttribute("message","Hello from Marko!");
		return "helloMarko";
	}
}
