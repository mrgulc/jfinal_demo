package com.demo.mycontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jfinal.handler.Handler;

public class MyHandle extends Handler{

	@Override
	public void handle(String target, HttpServletRequest request,
			HttpServletResponse response, boolean[] isHandled) {
		
//		String uri = request.getRequestURI();
//		if("/".equals(uri)){
//			target = "/glcview";
//		}
//		
		nextHandler.handle(target, request, response, isHandled);
		
	}
	
}
