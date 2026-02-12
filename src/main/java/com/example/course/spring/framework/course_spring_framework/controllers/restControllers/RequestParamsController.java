package com.example.course.spring.framework.course_spring_framework.controllers.restControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.spring.framework.course_spring_framework.models.dto.ParamsDto;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
	
	@GetMapping("/foo")
	public ParamsDto foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message) {
		ParamsDto params = new ParamsDto();
		params.setMessage(message);
		return params;
	}
	
	
	@GetMapping("/bar")
	public ParamsDto bar(@RequestParam String text, @RequestParam Integer code) {
		ParamsDto params = new ParamsDto();
		params.setMessage(text);
		params.setCode(code);
		return params;
	}
}
