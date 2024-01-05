package com.excelr.basic;

public class MainAppNoSpring {
	public static void main(String[] args) {
		System.out.println("I AM FROM MAIN METHOD");
		// ITrainer trainer = new TechnicalTrainer();
		// ITrainer trainer = new SoftSkillTrainer();
		ITrainer trainer = new DomainTrainer();
		TrainersFactory factory = new TrainersFactory();
		factory.setTrainer(trainer);
		factory.deliverTraining();
		System.out.println("END OF MAIN METHOD");
	}
}
