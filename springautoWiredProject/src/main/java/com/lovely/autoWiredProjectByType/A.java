package com.lovely.autoWiredProjectByType;

public class A {
	B bean;
	void m1(){
		bean.m2();
		System.out.println("m1() of A");
	}
	public B getBean() {
		return bean;
	}
	public void setBean(B bean) {
		this.bean = bean;
	}

}
