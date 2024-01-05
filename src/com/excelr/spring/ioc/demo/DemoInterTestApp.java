package com.excelr.spring.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoInterTestApp {
	public static void main(String[] args) {
		System.out.println("From Main Method");
		ApplicationContext context = new ClassPathXmlApplicationContext("demoInterConfig.xml");
		System.out.println(context);
		DemoInter demoInter = (DemoInter) context.getBean("demoInterImpl");
		String message = demoInter.wish("ExcelR Edu Tech");
		System.out.println(message);
		String msg = demoInter.getDateTime();
		System.out.println(msg);
		System.out.println("End Of Main");
	}
}
