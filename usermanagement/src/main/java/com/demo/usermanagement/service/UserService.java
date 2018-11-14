package com.demo.usermanagement.service;

import com.demo.usermanagement.model.User;

public interface UserService {
	public User getUserByName(String name);

	public User saveUser(User user);
}

