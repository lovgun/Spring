package com.lovely.mavenProjectInitialization;

public class Demo {
	private String name;
	private int id;
	private int age;
	private String degree ;
	 
	public void m(){
		 System.out.println("m () called");
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Demo(int age, String degree) {
		super();
		this.age = age;
		this.degree = degree;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
