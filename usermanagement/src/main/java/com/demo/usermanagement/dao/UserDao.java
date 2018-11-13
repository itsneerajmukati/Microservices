package com.demo.usermanagement.dao;

import com.demo.usermanagement.model.User;

public interface UserDao {
	
	public User getUserByName(String name);

}
