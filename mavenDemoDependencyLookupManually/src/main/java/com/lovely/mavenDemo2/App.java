package com.lovely.mavenDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
       DependencyLookupCar dLC= container.getBean(DependencyLookupCar.class);
       dLC.ride();
    }
}
