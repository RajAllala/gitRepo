package com.allala.spring.aop.interceptors;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class MethodAfterInterceptor implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		
		System.out.println("My name is: MethodAfterInterceptor");
		System.out.println("Class Name  "+arg3.getClass().getName());
		System.out.println("Method Name  "+arg1.getName());
		System.out.println("Method Args  "+Arrays.toString(arg2));
		System.out.println("Returning Object  " + arg0);
		System.out.println("Iam Done: MethodAfterInterceptor");
		
	}

}
