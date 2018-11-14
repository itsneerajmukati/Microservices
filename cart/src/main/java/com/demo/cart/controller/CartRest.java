package com.demo.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cart.model.Cart;
import com.demo.cart.model.UserInfo;
import com.demo.cart.service.UserServiceProxy;


@RestController
public class CartRest {
	
	@Autowired
	private UserServiceProxy userServiceProxy;
	
	
	@RequestMapping(name="addToCart", method = RequestMethod.GET)
	public Cart saveItem(@RequestParam(name="firstName") String firstName,@RequestParam(name="itemName") String itemName) {
		UserInfo userInfo = userServiceProxy.getUser(firstName);
		Cart cart = new Cart(itemName,userInfo);
		return cart;		
	}
}
