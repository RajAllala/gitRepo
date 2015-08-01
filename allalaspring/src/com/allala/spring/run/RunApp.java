package com.allala.spring.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import com.allala.spring.beans.Person;
import com.allala.spring.service.DemoService;

public class RunApp {
	
	public static void main(String[] args){
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("springbeans.xml");
		DemoService ds = (DemoService) ctx.getBean("database");
		
		System.out.println(ds.getCount());
		System.out.println(ds.getDataObject());
	}

}
