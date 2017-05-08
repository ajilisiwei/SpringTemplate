package com.wei.spring.aop.dao.impl;

import com.wei.spring.aop.dao.PersonDao;

public class PersonDaoImpl implements PersonDao{

	@Override
	public void savePerson(){
		// TODO Auto-generated method stub
		System.out.println("开始保存person...");
		System.out.println("即将产生一个异常...");
		int test=1/0;
	}

}
