package com.lovely.DependencyLookup;

public class Engine {
	private String name;
	public void start(){
		System.out.println(name+" " +"started");
	

}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}