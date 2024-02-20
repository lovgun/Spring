package com.lovely.mavenAutowiring.mavenAutoWiring;

public class A {
	B bean;
	void m1(){
		bean.m2();
		System.out.println("m() of A class");
	}
	public B getBean() {
		return bean;
	}
	public void setBean(B bean) {
		this.bean = bean;
	}

}
