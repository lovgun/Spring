package com.lovely.mavenDemo1.mavenDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext container = new ClassPathXmlApplicationContext("spring-cofig.xml");
        DemoByPropertyTag dBPT=container.getBean(DemoByPropertyTag.class);
        DemoByConstructorTag d=container.getBean(DemoByConstructorTag.class);
       System.out.println(d);
        System.out.println(dBPT);
        System.out.println(d.getId()+" "+d.getName());
        System.out.println(dBPT.getId()+" "+dBPT.getName());
        
    }
}
