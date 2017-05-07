package com.wei.spring.aopdemo;

public class Transication {

	public void beginTranciaction() {
		System.out.println("开始事务....");
	}
	
	public void commit() {
		System.out.println("事务提交....");
	}
}
