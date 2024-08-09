package com.springcrud.crud.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.crud.service.Servicelayer;

@RestController
public class ControllerDemo {
	private Servicelayer service;
	@GetMapping("/show")
	public void getAll()
	{
		service.add();
//		return "All Details shown";
	}
}
