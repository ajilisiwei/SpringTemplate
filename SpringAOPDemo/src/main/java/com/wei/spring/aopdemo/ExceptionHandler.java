package com.wei.spring.aopdemo;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionHandler implements ThrowsAdvice{

	public void afterThrowing(Exception e) throws Throwable {
		System.out.println("获得了一个异常...");
	}
	
}
