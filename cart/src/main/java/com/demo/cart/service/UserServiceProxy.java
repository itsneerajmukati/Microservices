package com.demo.cart.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.cart.model.Cart;

@FeignClient(name="user")
@RibbonClient(name="user")
public interface UserServiceProxy {
	
	@GetMapping("getUser")
	public Cart getUser();

}
