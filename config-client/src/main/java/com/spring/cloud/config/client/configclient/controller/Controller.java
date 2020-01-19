package com.spring.cloud.config.client.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.config.client.configclient.ConfigClientAppConfiguration;

@RestController
public class Controller {

	@Autowired
	private ConfigClientAppConfiguration properties;
	
	@Value("${some.other.property}")
	private String someOtherProperty;
	
	@RequestMapping("/")
	public String printConfig() {
		StringBuilder sb = new StringBuilder();
		sb.append(properties.getProperty()).append(" || ").append(someOtherProperty);
		return sb.toString();
	}
}
