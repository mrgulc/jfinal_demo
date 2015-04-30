package com.demo.mycontroller;

import com.jfinal.core.Controller;

public class HelloContorller extends Controller{
	public void index(){
		render("hello.html");
	}
}
