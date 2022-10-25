package com.neeraj.configexp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerClass {
	
	
	@Value("${spring.application.name}")
	  String message;
	
	@GetMapping("/name")
	String disp() 
	{
		return message;
	}
}
