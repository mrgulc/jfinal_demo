package com.demo.mycontroller;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

public class MyInterceptor implements Interceptor{

	@Override
	public void intercept(ActionInvocation ai) {
		System.out.println("before MyInterceptor");
		ai.invoke();
		System.out.println("after.MyInterceptor");
	}
	

}
