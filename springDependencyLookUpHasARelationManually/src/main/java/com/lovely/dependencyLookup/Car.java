package com.lovely.dependencyLookup;

public class Car {
	 private Engine eng = new Engine();
	
	private String name;
	
	public void ride(){
		eng.setName("powerEngine");
		eng.start();
		System.out.println(name+" "+"riding");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
