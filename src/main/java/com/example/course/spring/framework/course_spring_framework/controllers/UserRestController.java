package com.example.course.spring.framework.course_spring_framework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.spring.framework.course_spring_framework.models.User;
import com.example.course.spring.framework.course_spring_framework.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path="/details")
	public UserDto details() {
    	User user = new User("Andres", "Guzman");
    	UserDto userDto = new UserDto();
    	userDto.setUser(user);
    	userDto.setTitle("Hola Mundo spring boot");
		return userDto;

	}
}
