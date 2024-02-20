package com.lovely.autoWiredByName;

public class Aa {
	Bb bean;
	public void m1(){
		bean.m2();
		System.out.println("m1() of A");
	}
	public Bb getBean() {
		return bean;
	}
	public void setBean(Bb bean) {
		this.bean = bean;
	}

}