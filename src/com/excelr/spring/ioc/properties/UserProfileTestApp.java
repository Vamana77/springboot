package com.excelr.spring.ioc.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserProfileTestApp {
	public static void main(String[] args) {
		System.out.println("From Main Method");
		ApplicationContext context = new ClassPathXmlApplicationContext("demoInterConfig.xml");
		System.out.println(context);

		System.out.println("*******************");
		System.out.println("UserProfile");
		System.out.println("*******************");
		UserProfile userProfile = (UserProfile) context.getBean("userProfile");
		System.out.println(userProfile.sayHello());
		System.out.println("End Of Main");
	}
}
