package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataBaseProcess {

	
	@Before("execution(public String getStudent())")
	public void begainTra() {
		System.out.println("Start Tra.....");
	}
	
	@After("execution(public String getStudent())")
	public void commitTra() {
		System.out.println("Commit Tra.....");
	}
}