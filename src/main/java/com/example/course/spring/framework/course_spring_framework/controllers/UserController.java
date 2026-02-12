package com.example.course.spring.framework.course_spring_framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.course.spring.framework.course_spring_framework.models.User;



@Controller
public class UserController {
	
	@GetMapping("/details")
	public String details(Model model) {
		User user = new User("Andres", "Guzman");
		model.addAttribute("title","Hola Mundo spring boot");
		model.addAttribute("user", user);
		return "details";
	}
}
	