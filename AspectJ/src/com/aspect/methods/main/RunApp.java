package com.aspect.methods.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspect.methods.ExampleMethods;

public class RunApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
		
		ExampleMethods ex = (ExampleMethods) ctx.getBean("exampleMethod");
		System.out.println("Main method call returns : "+ex.sum(19,21));
		System.out.println("Main method call returns :" +ex.multiply(2,98));
		System.out.println(ex.divide(10, 0));
	}
}
