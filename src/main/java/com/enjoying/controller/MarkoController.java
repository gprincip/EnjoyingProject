package com.enjoying.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.enjoying.jpa.RadnikRepository;
import com.enjoying.jpa.StudentRepository;
import com.enjoying.model.Student;
import com.enjoying.model.radnik;

@Controller
public class MarkoController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	RadnikRepository radnikRepository;
	
	@RequestMapping(value="/helloMarko", method=RequestMethod.GET)
	 public String sayHelloMarko(ModelMap model)
	 { 
	  
	  //studentRepository.save(new Student("Pera","12345"));
	  //System.out.println(studentRepository.findAll());
	  radnik r = new radnik("pera");
	  r.setStudent(new Student("Laza","555555"));
	  
	  radnikRepository.save(r);
	  System.out.println(radnikRepository.findAll());
	  
	  model.addAttribute("message","Hello from Marko!");
	  return "helloMarko";
	 }
}
