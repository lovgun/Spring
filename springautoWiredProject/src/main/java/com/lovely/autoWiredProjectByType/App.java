package com.lovely.autoWiredProjectByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovely.autoWiredByName.Aa;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext container =new ClassPathXmlApplicationContext("spring-config.xml");
     A a=container.getBean(A.class);
     a.m1();
     Aa aa=container.getBean(Aa.class);
     aa.m1();
    
    }
}
