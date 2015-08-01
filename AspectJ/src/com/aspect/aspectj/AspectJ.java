package com.aspect.aspectj;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect 
public class AspectJ {
	
	/*
	 * @Before executes before each method of the matching regular expression
	 * And returns the class name and Method Name where it is executed.
	 */
	
	@Before(value = "execution(* com.aspect.methods..*.*(..))")
	public void CheckArgumentsBefore(JoinPoint joinpoint){
		System.out.println("I am Before Inteceptor Class Name" + joinpoint.getTarget().getClass());
		System.out.println("I am Before Interceptor Method Name " +joinpoint.getSignature().getName());
	}
	
	
	/*
	 * @After executes after each method starts executing
	 * And returns the values of the arguments.
	 */
	
	
	@After(value = "execution(* com.aspect.methods..*.*(..))")
	public void CheckArgumentsAfter(JoinPoint joinpoint){
		System.out.println("Arguments passed to the Method are" + Arrays.toString(joinpoint.getArgs()));
	}
	
	/*
	 * @AfterReturning executes after successful completion of a method execution.
	 * And we can return the result of the method 
	 */
	
	@AfterReturning(value = "execution(* com.aspect.methods..*.*(..))",returning="result")
	public void doAfterReturning(JoinPoint joinpoint, Object result){
		System.out.println("I am After Returning Interceptor");
		System.out.println("Method Returns " +result);
	}
	
	/*
	 * @AfterThrowing checks for the exception and gets executed.
	 * And it returns the Exception
	 */
	
	@AfterThrowing(value = "execution(* com.aspect.methods..*.*(..))",throwing="result")
	public void doAfterThrowing(JoinPoint joinpoint, Object result){
		System.out.println("I am After Returning Interceptor");
		System.out.println("Method Returns "+result);
	}
	
}
