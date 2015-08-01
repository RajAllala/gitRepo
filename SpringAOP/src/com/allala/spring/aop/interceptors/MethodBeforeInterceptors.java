package com.allala.spring.aop.interceptors;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeInterceptors implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("My name is: MethodBeforeInterceptor");
		System.out.println("Class Name  "+arg2.getClass().getName());
		
		System.out.println("Method Name  "+arg0.getName());
		
		System.out.println("Method Args  "+Arrays.toString(arg1));
		
		System.out.println("Iam Done: MethodBeforeInterceptor");
	}

}
