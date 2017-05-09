package com.wei.spring.privilege.annotation;

import java.lang.reflect.Method;

public class AnnotationParse {
	public static String parse(Class<?> targetClass,String methodName) throws Exception {
		String methodAcces="";
		Method method=targetClass.getMethod(methodName);
		if (method.isAnnotationPresent(PrivilegeInfo.class)) {
			PrivilegeInfo privilegeInfo=method.getAnnotation(PrivilegeInfo.class);
			methodAcces=privilegeInfo.name();
		}
		return methodAcces;
	}
}
