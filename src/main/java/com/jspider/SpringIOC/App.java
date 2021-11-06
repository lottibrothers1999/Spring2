package com.jspider.SpringIOC;
import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Car car=context.getBean(Car.class);
    	System.out.println(car);
    	
    	
    }
}
