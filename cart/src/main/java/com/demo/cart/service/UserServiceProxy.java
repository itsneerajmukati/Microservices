package com.demo.cart.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.cart.model.UserInfo;

@FeignClient(name="user")
@RibbonClient(name="user")
public interface UserServiceProxy {
	
	@RequestMapping(method = RequestMethod.GET, name="/getUser")
	public UserInfo getUser(@RequestParam(value = "name") String name);

}
