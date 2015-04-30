package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployerMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext1.xml"});
		Employer employer = (Employer) context.getBean("employer");
		employer.wantDo();
	}
}
