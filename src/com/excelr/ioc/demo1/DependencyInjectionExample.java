package com.excelr.ioc.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionExample {
	public static void main(String[] args) {
		System.out.println("From Main Method");
		ApplicationContext context = new ClassPathXmlApplicationContext("courseConfig.xml");
		System.out.println(context);
		Trainee trainee = (Trainee) context.getBean("trainee");
		System.out.println(trainee.displayEmpDetails());

		System.out.println("isSingleton:" + context.isSingleton("course"));
		System.out.println("isPrototype:" + context.isPrototype("course"));
		System.out.println("containsBean:" + context.containsBean("course"));

		Trainee traineeNew = (Trainee) context.getBean("traineeNew");
		System.out.println(traineeNew.displayEmpDetails());
		traineeNew.getCourse().setCourseCost(45000);
		System.out.println(traineeNew.displayEmpDetails());
		System.out.println(trainee.displayEmpDetails());
	}
}
