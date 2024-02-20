package com.lovely.DependencyLookup;

public class Car {
	private String name;
	private Engine eng;
	public void ride(){
		
		eng.start();
		System.out.println(name +" "+"is moving");
		
	}
	public String getName() {
		return name;
	}
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	public void setName(String name) {
		this.name = name;
	}

}
