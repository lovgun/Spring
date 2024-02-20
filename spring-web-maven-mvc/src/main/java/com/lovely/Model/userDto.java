package com.lovely.Model;

public class userDto {
	private String username;
	private String password;
	private String degree;
	private int no;
	private String designation;
	public String getUsername() {
		return username;
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
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "userDto [username=" + username + ", password=" + password + ", degree=" + degree + ", no=" + no
				+ ", designation=" + designation + "]";
	}
	
}
