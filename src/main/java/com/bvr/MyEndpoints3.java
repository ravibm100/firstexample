package com.bvr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndpoints3 {
	
	@Autowired
	ExampleProperties props;
	
	@RequestMapping("/greetOthers")
	public String greet(@RequestParam String details) {
		return props.getGreeting() + details;
	}
}
