package com.lovely.DependencyLookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
     Car car=container.getBean(Car.class);
     //Engine engine=EngineFactory.getEngine("turbo");
     Engine engine=EngineFactory.getEngine("Power");
     car.setEng(engine);
    
     car.ride();

    }
}
