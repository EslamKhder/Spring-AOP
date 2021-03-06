package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataBaseProcess {

	
	@Before("execution(public * getStudent())")
	public void start() {
		System.out.println("Start .....");
	}
	
	@AfterThrowing("execution(public * getStudent())")
	public void myException() {
		System.out.println("This is Exception ....");
	}
	
	/*
	@After("execution(public String getStudent())")
	public void end1() {
		System.out.println("End 1 .....");
	}
	
	@AfterReturning("execution(public String getStudent())")
	public void end2() {
		System.out.println("End 2 .....");
	}*/
}
