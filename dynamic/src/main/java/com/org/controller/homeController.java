package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class homeController {
	@RequestMapping("hello")
public String homepage() {
	return "home";
}
}
