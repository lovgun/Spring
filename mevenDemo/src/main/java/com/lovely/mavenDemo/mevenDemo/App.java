package com.lovely.mavenDemo.mevenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
        Demo demo=container.getBean(Demo.class);
        System.out.println(demo);
    }
}
