package com.spring.cloud.application.service.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationServiceController {

	@Value("${service.instance.name}")
	private String instance;
	
	@RequestMapping("/")
	public String message() {
		return "Hello from " + instance;
	}
}
