package com.org.spring.vice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect

public class AfterAdvice {
	@After("execution(* com.org.spring.*.add(..))")
	public void allDaoAddMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method: " + joinPoint);
		System.out.println("Intercepted method: " + joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	@After("execution(*com.org.spring.*.*(..))")
	public void allDaoAnyMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method: " + joinPoint);
		System.out.println("Intercepted method: " + joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
}
