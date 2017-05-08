package com.wei.spring.aop.service.impl;


import com.wei.spring.aop.dao.impl.PersonDaoImpl;
import com.wei.spring.aop.service.PersonService;


public class PersonServiceImpl implements PersonService{

	private PersonDaoImpl persondaoimpl;
	
	public PersonDaoImpl getPersondaoimpl() {
		return persondaoimpl;
	}

	public void setPersondaoimpl(PersonDaoImpl persondaoimpl) {
		this.persondaoimpl = persondaoimpl;
	}

	@Override
	public void savePerson() {
		persondaoimpl.savePerson();
	}

}
