package com.lovely.mavenDemo2;

public class DependencyLookupEngine {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void start(){
		System.out.println(name+" "+"started");
		
	}

}
