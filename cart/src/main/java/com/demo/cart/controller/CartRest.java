package com.demo.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cart.model.Cart;
import com.demo.cart.service.UserServiceProxy;


@RestController
public class CartRest {
	
	@Autowired
	private UserServiceProxy userServiceProxy;
	
	
	@RequestMapping(name="addToCart", method = RequestMethod.GET)
	public Cart saveItem() {
		Cart cart = userServiceProxy.getUser();
		return new Cart(1, "Item added " ,cart.getName(),cart.getPort());
	}
}
