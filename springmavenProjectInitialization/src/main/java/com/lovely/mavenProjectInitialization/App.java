package com.lovely.mavenProjectInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
    Demo demo=container.getBean(Demo.class);
    System.out.println(demo.getId()+" "+demo.getName());
    System.out.println(demo.getAge()+" "+demo.getDegree());
    
    }
}
