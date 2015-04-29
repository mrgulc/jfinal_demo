package com.demo.mycontroller;

import com.demo.blog.Blog;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

public class MyController extends Controller{
	public void index(){
		render("index.html");
	}
	
	@Before(AddValidator.class)
	public void save(){
		getModel(Blog.class).save();
		redirect("/glcview");
	}
	
	public void add(){
		
	}
}
