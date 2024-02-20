package com.lovely.basePackage.basePackageMavenProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	@Autowired
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
