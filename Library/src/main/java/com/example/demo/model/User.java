package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String userName;
	private String password;
	
	public User() {
		super();
		System.out.println("Inside User :");
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
