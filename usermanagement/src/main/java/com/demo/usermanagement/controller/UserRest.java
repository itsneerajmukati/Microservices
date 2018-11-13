package com.demo.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.usermanagement.model.User;

@RestController
public class UserRest {
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(method = RequestMethod.GET, name="/getUser")
	public User getUser() {
		return new User(101, "test",environment.getProperty("local.server.port"));
	}
	
}
