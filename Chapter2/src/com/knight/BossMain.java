package com.knight;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BossMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext1.xml");
		Boss boss = (Boss) ac.getBean("boss");
		boss.wantPersonDo();
	}
}
