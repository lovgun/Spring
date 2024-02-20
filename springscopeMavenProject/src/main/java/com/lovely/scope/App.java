package com.lovely.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
         
    ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
    Demo demo1=container.getBean(Demo.class);
    Demo demo2=container.getBean(Demo.class);
    System.out.println(demo1);
    System.out.println(demo2);
    Demo1 d1=container.getBean(Demo1.class);
    Demo1 d2=container.getBean(Demo1.class);
    
    System.out.println(d1);
    System.out.println(d2);
    }
    
}
