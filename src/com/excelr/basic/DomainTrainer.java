package com.excelr.basic;

public class DomainTrainer implements ITrainer {
	public DomainTrainer() {
		System.out.println(this);
	}

	@Override
	public void doTeach() {
		System.out.println("Deliver Domain Training Like Banking/Financial Services");
	}
}
