package com.capgemini.spring.test;

import com.capgemini.spring.renderer.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
		MessageRenderer renderer = context.getBean(MessageRenderer.class);
		renderer.render();		 

		MessageRenderer renderer1 = context.getBean(MessageRenderer.class);
		
		System.out.println(renderer.hashCode());		 
		System.out.println(renderer1.hashCode());		 
	}

}