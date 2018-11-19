package com.demo.usermanagement.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.usermanagement.dao.UserDao;
import com.demo.usermanagement.model.User;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
	
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	
	@Mock
	private UserDao userDao;
	
	@Test
	public void testGetUserByName() {
		String name= "neeraj";
		User user = new User();
		user.setFirstName("neeraj");
		user.setLastName("mukati");
		user.setId(1);
		Mockito.when(userDao.getUserByName(name)).thenReturn(user );
		userServiceImpl.getUserByName(name);
		Assert.assertNotNull(user);
	}
	
	@Test
	public void testSaveUser() {
		User user = new User();
		user.setFirstName("neeraj");
		user.setLastName("mukati");
		Mockito.when(userDao.saveUser(user)).thenReturn(user);
		user = userServiceImpl.saveUser(user);
		Assert.assertEquals(user, user);
	}

}
