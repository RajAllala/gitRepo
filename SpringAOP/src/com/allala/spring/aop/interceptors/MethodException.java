package com.allala.spring.aop.interceptors;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class MethodException implements ThrowsAdvice {
	
	public void afterThrowing(Method method, Object[] args,Object target,Exception ex){
		
		System.out.println("My name is : MethodException");
		System.out.println("My Method"+ method.getName());
		System.out.println("Arguments"+Arrays.toString(args));
		System.out.println("Target Class"+target);
		System.out.println(ex.getMessage());		
		System.out.println("I am Done  MethodException");
	}

}
