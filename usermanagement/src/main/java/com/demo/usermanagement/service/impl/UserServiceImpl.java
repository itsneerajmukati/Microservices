package com.demo.usermanagement.service.impl;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.usermanagement.dao.UserDao;
import com.demo.usermanagement.model.User;
import com.demo.usermanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserByName(String name) {
		return userDao.getUserByName(name);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public User saveUser(User user) {
		return userDao.saveUser(user);
	}
	
}
