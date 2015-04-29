package com.demo.mycontroller;

import com.demo.blog.Blog;
import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class AddValidator extends Validator{

	@Override
	protected void validate(Controller c) {
		validateRequiredString("blog.title", "titleMsg", "标题不能为空");
		validateRequired("blog.content", "contentMsg", "内容不能为空");
		
	}

	@Override
	protected void handleError(Controller c) {
		// TODO Auto-generated method stub
		c.keepModel(Blog.class);
		String actionKey = getActionKey();
		if(actionKey.equals("/glcview/save")){
			c.render("add.html");
		}
	}
	

}
