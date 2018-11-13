package com.demo.usermanagement.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.demo.usermanagement.dao.UserDao;
import com.demo.usermanagement.model.User;

public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public User getUserByName(String name) {
		return (User) entityManager.createNamedQuery("select * from User u where u.name=:name")
		.setParameter("name", name)
		.getSingleResult();
	}
	
}
