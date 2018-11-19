package com.demo.cart.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.cart.model.Cart;
import com.demo.cart.model.UserInfo;
import com.demo.cart.service.UserServiceProxy;

@RunWith(MockitoJUnitRunner.class)
public class CartRestControllerTest {
	
	@InjectMocks
	private CartRest cartRest;
	
	@Mock
	private UserServiceProxy userServiceProxy;
	
	@Test
	public void saveItemTest() {
		String firstName = "neeraj";
		String itemName = "Phone";
		UserInfo userInfo = new UserInfo();
		Mockito.when(userServiceProxy.getUser(firstName)).thenReturn(userInfo );
		Cart cart = cartRest.saveItem(firstName, itemName);
		Assert.assertNotNull(cart);
	}
	
	
	
}
