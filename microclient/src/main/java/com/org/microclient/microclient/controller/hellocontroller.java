package com.org.microclient.microclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sub")
public class hellocontroller {
	@GetMapping("/add")
public helloservice retrive(){
	return new helloservice(5000,1000);
}
}
