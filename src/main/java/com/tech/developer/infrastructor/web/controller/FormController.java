package com.tech.developer.infrastructor.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.developer.domain.Gender;
import com.tech.developer.domain.Person;
import com.tech.developer.domain.Tech;

@Controller
@RequestMapping(path = "/public")
public class FormController {	
	
	@GetMapping(path = "/view")
	public String start(Model model) {		
		Person person = new Person();
		person.setGender(Gender.MALE);
		person.setTech(List.of(Tech.JAVAEE));
		model.addAttribute("person",person);		
		return "form";
	}	
	
	@PostMapping(path = "/view/result")
	public String result(@ModelAttribute("person") Person person, Model model) {
		model.addAttribute("people",List.of(person));
		return "form";
	}

}
