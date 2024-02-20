package com.lovely.dependencyLookUpHasArRealtion2;

public class TurboEngine implements Engine {
private String name;
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+"started");
		
	}

}
