package com.bvr;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("oracleprops")
public class ExampleProperties {

	public ExampleProperties() {
		// TODO Auto-generated constructor stub
	}
	
	private String greeting = "Thank you";

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	} 

}
