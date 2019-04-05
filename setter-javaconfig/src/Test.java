package com.capgemini.spring.test;

import com.capgemini.spring.renderer.MessageRenderer;
import com.capgemini.spring.configuration.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test{
	public static void main(String args[]){
		//ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		ApplicationContext context = new AnnotationConfigApplicationContext(GoodMorningConfiguration.class);
		MessageRenderer renderer = (MessageRenderer)context.getBean("renderer");
		renderer.render();
		MessageRenderer renderer1 = (MessageRenderer)context.getBean("renderer");
		System.out.println(renderer.hashCode());
		System.out.println(renderer1.hashCode());
			 
	}

}