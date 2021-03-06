package com.anurag.springbootloggingapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootLoggingApplication {
	
	Logger log = LoggerFactory.getLogger(SpringBootLoggingApplication.class);
	
	@GetMapping("/test")
	public String greeting(@PathVariable String name) {
		log.debug("Request {}", name);
		
		String response = "Hi " + name + "welcome";
		
		log.debug("Response {}", response);
		
		return response;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootLoggingApplication.class, args);

	}

}
