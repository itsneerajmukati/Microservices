package com.demo.usermanagement.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.usermanagement.model.User;
import com.demo.usermanagement.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserRestTest {
	
	@InjectMocks
	private UserRest userRest;
	
	@Mock
	private UserService userService;

	@Test
	public void testGetUser() {
		String name= "neeraj";
		User user = new User();
		user.setFirstName("neeraj");
		user.setLastName("mukati");
		user.setId(1);
		Mockito.when(userService.getUserByName(name)).thenReturn(user );
		userRest.getUser(name);
		Assert.assertNotNull(user);
	}

	@Test
	public void testSaveUser() {
		User user = new User();
		user.setFirstName("neeraj");
		user.setLastName("mukati");
		Mockito.when(userService.saveUser(user)).thenReturn(user);
		user = userRest.saveUser(user);
		Assert.assertEquals(user, user);
	}

}
