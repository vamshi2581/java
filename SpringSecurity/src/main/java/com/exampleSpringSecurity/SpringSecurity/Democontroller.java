package com.exampleSpringSecurity.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Democontroller {

	@GetMapping("/call")
	public String hello() {
		return "SpringBoot";
	}
	
}
