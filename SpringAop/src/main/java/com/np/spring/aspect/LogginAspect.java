package com.np.spring.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {
	
		@Before("execution(* com.np.spring.service.impl.IntrestImpl.getIntrest(..))")
		public void logBefore(JoinPoint joinPoint) {
			System.out.println("Intrest calcultion requested");
		}
		
		@After("execution(* com.np.spring.service.impl.IntrestImpl.getIntrest(..))")
		public void logAfter(JoinPoint joinpoint) {
			System.out.println("Intrest calculation under process");
		}
}
