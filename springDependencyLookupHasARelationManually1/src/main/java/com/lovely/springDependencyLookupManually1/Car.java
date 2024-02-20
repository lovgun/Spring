package com.lovely.springDependencyLookupManually1;

public class Car {
	 private Engine eng;
		private String name;
	
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}

	
	public void ride(){
	
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
