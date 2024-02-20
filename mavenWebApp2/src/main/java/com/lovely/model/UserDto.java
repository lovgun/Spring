package com.lovely.model;

import org.springframework.beans.factory.annotation.Value;

public class UserDto {
//	@Value("username")
	private String user;
	private String password;
	private int age;
	private String address;
	
	
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return "UserDto [user=" + user + ", password=" + password + ", age=" + age + ", address=" + address + "]";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
