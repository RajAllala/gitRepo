package com.allala.spring.aop.interceptors;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodAroundInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		
		System.out.println("Logging Before........");
		System.out.println("Class Name: "+arg0.getThis().getClass().getName());
		System.out.println("Method Name: "+arg0.getMethod().getName());
		System.out.println("Arguments: "+Arrays.toString(arg0.getArguments()));
		System.out.println("Now i will be able to run the method....");
		System.out.println("i will be able to get return as well....");
		
		try{
			Object result = arg0.proceed();
			System.out.println("Printing result from method return....");
			System.out.println(result);
		}catch(Exception ex){
			System.out.println("Logging at Exception.....");
			System.out.println("Caught exception.....");
			System.out.println("Excption Name : "+ex.getMessage());
			
		}
		System.out.println("i want return anythinh i want .....");
		return null;
	}

}
