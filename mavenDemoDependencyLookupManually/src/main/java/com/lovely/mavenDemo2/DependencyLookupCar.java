package com.lovely.mavenDemo2;

public class DependencyLookupCar {
	private String name;
	private DependencyLookupEngine engine = new DependencyLookupEngine();
	public void ride(){
		engine.setName("powerEngine");
		engine.start();
		System.out.println(name+"  "+"moving now");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DependencyLookupEngine getEngine() {
		return engine;
	}
	public void setEngine(DependencyLookupEngine engine) {
		this.engine = engine;
	}

}
