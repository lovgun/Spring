package com.lovely.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Da0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
        DemoBean bean=container.getBean(DemoBean.class);
        System.out.println(bean);
        bean.m();
	}

}
