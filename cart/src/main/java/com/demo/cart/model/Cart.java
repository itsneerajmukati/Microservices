package com.demo.cart.model;

public class Cart {
	
	Integer id;
	String item;
	String name;
	String port;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public Cart() {
		
	}
	public Cart(Integer id, String item,String name,String port) {
		super();
		this.id = id;
		this.item = item;
		this.name = name;
		this.port = port;
	} 
	
	
}
