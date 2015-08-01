package com.allala.jdbc.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

public class AspectJDBC {
		
	@Before("execution(* com.allala.jdbc..*.*(..))")
	public void beforeallmethods(JoinPoint joinpoint){
		System.out.println("Before Aspect is Executed !!!");
		System.out.println("Class Name :"+ joinpoint.getTarget().getClass().getName());
		System.out.println("Method Name : "+ joinpoint.getSignature().getName());
	}
	
	@After(value="execution(* com.allala.jdbc..*.*(..))")
	
	public void AFterallmethods(JoinPoint joinpoint){
		System.out.println("After Aspect is Executed !!!");
		System.out.println("Class Name :"+ joinpoint.getTarget().getClass().getName());
		System.out.println("Method Name : "+ joinpoint.getSignature().getName());
	}
	
	
}
