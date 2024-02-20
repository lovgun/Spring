package com.lovely.basePackage.basePackageMavenProject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class B {
	@Value("lovely")
	String name;
	void m2(){
		System.out.println("m2() of b class");
		System.out.println(name);
		
	}

}
