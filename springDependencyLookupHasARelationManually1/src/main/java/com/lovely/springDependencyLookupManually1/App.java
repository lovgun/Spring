package com.lovely.springDependencyLookupManually1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
        Car car=container.getBean(Car.class);
   
        Engine engine=EngineFactory.getEngine("turbo");
        car.setEng(engine);

        car.ride();
    }
}
