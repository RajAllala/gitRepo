package com.allala.spring.ioc.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.allala.spring.ioc.service.GenericService;

public class RunApp {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
		GenericService gs = (GenericService) ctx.getBean("GenericService123");
		
		System.out.println("##########> START  <###########");
		System.out.println(gs.getEveryNews());		
		System.out.println("##########> END <###########");

	}

}
