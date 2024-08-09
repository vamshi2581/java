package com.org.configclientdemo.configclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/welcome")
public class WelcomeController {
	@Value("${app.name}")
	
	String appname;
	@Value("${app.welcome}")
	String appwelcomemessage;
	
	@Value("${db.connection.string}")
	String dbConnectionURL;
	@Value("${db.connection.username}")
	String dbConnectionUser;
	@Value("${db.connection.password}")
	String dbConnectionPassword;
	
	
	@GetMapping("/user")
	public String welcomeUser() {
		return appwelcomemessage +" to "+appname;
	}
	@GetMapping("/db")
    public String checkDB() {
        return dbConnectionURL + " | "+dbConnectionUser+" | "+dbConnectionPassword;
    }
	
	
	
}
