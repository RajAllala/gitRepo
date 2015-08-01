package com.allala.spring.aop.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

public class MyGenericAspect {
	/*
	@Before(value="execution(* com.allala.spring..*.*(..))")
	
	public void doSomethingForMeBefore(JoinPoint joinpoint){
		System.out.println("Am the Aspectj interceptor and u can call me MyBeforeAspect");
		
		System.out.println(joinpoint.getTarget().getClass().getName());
		System.out.println(joinpoint.getSignature().getName());
		System.out.println(Arrays.toString(joinpoint.getArgs()));
		
		System.out.println("I am done with the Job");
	}
		
		
		@After(value="execution(* com.allala.spring..*.*(..))")
		
		public void doSomethingForMeAfter(JoinPoint joinpoint){
			System.out.println("Am the Aspectj interceptor and u can call me MyAfterAspect");
			
			System.out.println(joinpoint.getTarget().getClass().getName());
			System.out.println(joinpoint.getSignature().getName());
			System.out.println(Arrays.toString(joinpoint.getArgs()));
			
			System.out.println("I am done with the Job");
		
	}
		
		
@AfterReturning(value="execution(* com.allala.spring..*.*(..))",returning="result")
		
		public void doSomethingForMeAfterReturn(JoinPoint joinpoint,Object result){
			System.out.println("Am the Aspectj interceptor and u can call me MyAfterReturning Aspect");
			System.out.println(result);
			
			System.out.println("I am done with the Job");
	
	}


@AfterThrowing(value="execution(* com.allala.spring..*.*(..))",throwing="result")

public void doSomethingForMeAfterThrowing(JoinPoint joinpoint,Throwable result){
	System.out.println("Am the Aspectj interceptor and u can call me MyAfterReturning Aspect");
	System.out.println(result.getMessage());
	
	System.out.println("I am done with the Job");

}
*/
	
	
	@Around (value="execution (* com.allala.spring..*.*(..))")
	public Object doSomethingForMeAllAround(ProceedingJoinPoint joinpoint){
		System.out.println("Am the Aspectj interceptor and u can call me AllARound Aspect");
		System.out.println(joinpoint.getTarget().getClass().getName());
		System.out.println(joinpoint.getSignature().getName());
		System.out.println(Arrays.toString(joinpoint.getArgs()));
		System.out.println("###########################################");
		Object result=null;
		
		try{
			result=joinpoint.proceed();
			System.out.println("After Returning");
			System.out.println("I am printing the return Object from  "+joinpoint.getTarget().getClass().getName());
			System.out.println(result);
		}catch(Throwable ex){
			System.out.println(ex.getMessage());
			
		}
		return result;
		
	}

}
