package com.demo.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.usermanagement.model.User;
import com.demo.usermanagement.service.UserService;

@RestController
public class UserRest {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, name="/getUser")
	public User getUser(@RequestParam(value = "name") String name) {
		return userService.getUserByName(name);
	}
	
	@RequestMapping(method = RequestMethod.POST, name="/saveUser",consumes = {"application/json"})
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
}
