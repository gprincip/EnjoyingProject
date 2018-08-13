package com.enjoying.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping(value = "/helloMarko", method = RequestMethod.GET)
	public String sayHelloMarko(ModelMap model) {

		// studentRepository.save(new Student("Pera","12345"));
		// System.out.println(studentRepository.findAll());
		
		int i = 0;
		
		while (i < 100) {
			radnik r = new radnik("pera");
			r.setStudent(new Student("Laza", "555555"));
			radnikRepository.save(r);
		}
		
		System.out.println("i = " + i + " " + radnikRepository.findAll());

		model.addAttribute("message", radnikRepository.findAll());
		return "helloMarko";
	}
	
	@RequestMapping(value="/logIn", method = RequestMethod.POST)
	public String logIn(@RequestParam(name = "username") String username, Model model) {
		List<Student> student = studentRepository.findStudent(username);
		if(student.size() > 0) {
			model.addAttribute("attrib","Welcome");
		}else model.addAttribute("attrib", "Wrong username and password");
		return "test1";
	}
	
	
	
}
