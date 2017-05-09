package com.wei.spring.privilege.service.impl;

import com.wei.spring.privilege.annotation.PrivilegeInfo;
import com.wei.spring.privilege.service.PersonService;

public class PersonServiceImpl implements PersonService{

	@PrivilegeInfo(name="savePerson")
	public void savePerson() {
		System.out.println("save person...");
		
	}

	@PrivilegeInfo(name="updatePerson")
	public void updatePerson() {
		System.out.println("update person...");
		
	}

}
