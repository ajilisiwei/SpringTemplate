package com.wei.spring.aop.utils;

public class ExceptionHandler{
	public void afterThrowing(Throwable e){
		System.out.println(e.toString());
	}
}
