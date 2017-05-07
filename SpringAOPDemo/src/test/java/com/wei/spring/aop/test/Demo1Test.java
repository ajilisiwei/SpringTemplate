package com.wei.spring.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wei.spring.aopdemo.PersonDao;

public class Demo1Test {

	@Test
	public void Test1(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao demo1DaoImpl = (PersonDao)context.getBean("personDaoImpl");
		demo1DaoImpl.savePerson();
	}
}
