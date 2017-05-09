package com.wei.spring.privilege.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wei.spring.privilege.aspect.PrivilegeAspect;
import com.wei.spring.privilege.bean.Privilege;
import com.wei.spring.privilege.service.PersonService;

public class Demo3Test {

	@Test
	public void Test1() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PrivilegeAspect privilegeAspect = (PrivilegeAspect)context.getBean("privilegeAspect");
		List<Privilege> privileges=new ArrayList<>();
		Privilege privilege1=new Privilege();
		privilege1.setName("savePerson");
		privileges.add(privilege1);
		privilegeAspect.setPrivileges(privileges);
		
		PersonService personService= (PersonService)context.getBean("personServiceImpl");
		personService.savePerson();
		
		personService.updatePerson();
	}
}
