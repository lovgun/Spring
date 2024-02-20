package com.lovely.DependencyLookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext container= new ClassPathXmlApplicationContext("spring-config.xml");
     Demo demo=container.getBean(Demo.class);
     Demo demo1=container.getBean(Demo.class);
     System.out.println(demo);
     System.out.println(demo1);
        
    }
}
