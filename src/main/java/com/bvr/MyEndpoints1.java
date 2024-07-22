package com.bvr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndpoints1 {
	
	@RequestMapping("/mypage")
	public String myString() {
		return "Example";
	}
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Example" + name;
	}
	
	@RequestMapping(path="/pathvarexample/name")
	public String sayHello2(@RequestParam String name) {
		return "Example" + name;
	}

	@GetMapping(path="/secondSampleBean")
	public SecondSampleBean secondBean() {
		return new SecondSampleBean("Hello");
	}
}
