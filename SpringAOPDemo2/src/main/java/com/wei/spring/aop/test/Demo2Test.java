package com.wei.spring.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wei.spring.aop.service.PersonService;
import com.wei.spring.aop.service.impl.PersonServiceImpl;

public class Demo2Test {
	
	@Test
	public void Test1(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personsv=(PersonService)context.getBean("personServiceImpl");
		personsv.savePerson();
	}
}
