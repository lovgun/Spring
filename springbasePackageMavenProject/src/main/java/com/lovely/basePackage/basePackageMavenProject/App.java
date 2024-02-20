package com.lovely.basePackage.basePackageMavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container =new ClassPathXmlApplicationContext("spring-config.xml");
        A a=container.getBean(A.class);
        a.m1();
    }
}
