package com.excelr.basic;

public class TechnicalTrainer implements ITrainer {
	public TechnicalTrainer() {
		System.out.println(this);
	}

	@Override
	public void doTeach() {
		System.out.println("Deliver Technical Training Sessions");
	}

}
