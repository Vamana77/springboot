package com.excelr.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppWithSpring {
	public static void main(String[] args) {
		System.out.println("I AM FROM MAIN METHOD");
		ApplicationContext context = new ClassPathXmlApplicationContext("trainerConfiguration.xml");
		System.out.println(context);
		TrainersFactory trainersFactory = (TrainersFactory) context.getBean("tFactory");
		trainersFactory.deliverTraining();
		System.out.println("END OF MAIN METHOD");
	}
}
