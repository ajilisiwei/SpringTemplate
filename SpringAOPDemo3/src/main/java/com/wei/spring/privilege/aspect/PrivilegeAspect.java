package com.wei.spring.privilege.aspect;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;

import com.wei.spring.privilege.annotation.AnnotationParse;
import com.wei.spring.privilege.bean.*;


public class PrivilegeAspect {
	
	private List<Privilege> privileges=new ArrayList<Privilege>();
	
	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	public void isAccessMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		Class<? extends Object> targetClass=joinPoint.getTarget().getClass();
		String methodName=joinPoint.getSignature().getName();
		String methodAccess=AnnotationParse.parse(targetClass, methodName);
		boolean flag=false;
		for (Privilege privilege : privileges) {
			if (privilege.getName().equals(methodAccess)) {
				System.out.println("methodAccess:"+methodAccess);
				System.out.println("privilege:"+privilege.getName());
				flag=true;
			}
		}
		
		if (flag) {
			joinPoint.proceed();
		}else {
			System.out.println("你没有权限...");
		}
	}
}
