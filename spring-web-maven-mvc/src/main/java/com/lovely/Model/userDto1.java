package com.lovely.Model;

public class userDto1 {
	private String username;
	private String password;
	private String degree;
	private int age;
	private String designation;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "userDto1 [username=" + username + ", password=" + password + ", degree=" + degree + ", age=" + age
				+ ", designation=" + designation + "]";
	}
	
	
}
