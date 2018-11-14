package com.demo.cart.model;

public class Cart {
	
	private String items;
	private UserInfo userInfo;
	
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	public Cart(String items, UserInfo userInfo) {
		super();
		this.items = items;
		this.userInfo = userInfo;
	}
	
}
