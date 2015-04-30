package com.demo.mycontroller;

import java.util.List;

import com.demo.blog.Blog;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

public class MyController extends Controller{
	public void index(){
		
	}
	
	@Before(AddValidator.class)
	public void save(){
		getModel(Blog.class).save();
		redirect("/glcview");
	}
	
	public void add(){
		
	}
	
	public void list(){
		String sql = "Select * from blog";
		List<Blog> blogs = Blog.me.find(sql);
		setAttr("blogs", blogs);
		render("list.jsp");
		render("lists.html");
	}
}
