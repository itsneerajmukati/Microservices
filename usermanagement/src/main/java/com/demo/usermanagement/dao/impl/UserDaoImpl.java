package com.demo.usermanagement.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.usermanagement.dao.UserDao;
import com.demo.usermanagement.model.User;

@Component
@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public User getUserByName(String name) {
		try {
			return (User) entityManager.createQuery("select u from User u where u.firstName=:name")
					.setParameter("name", name)
					.getSingleResult();
			}catch(NoResultException ex) {
				return null;
			}
	}

	@Override
	public User saveUser(User user) {
		return entityManager.merge(user);
	}
	
}
