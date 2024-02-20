package com.lovely.mavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
   ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
    Dao dao=container.getBean(Dao.class);
    System.out.println(dao);
    dao.m();
    }
    
}
