package com.demo.usermanagement.model;

public class User {
	
	Integer id;
	String name;
	String port;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public User(Integer id, String name,String port) {
		super();
		this.id = id;
		this.name = name;
		this.port = port;
	}
	
}
