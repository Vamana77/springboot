package com.excelr.basic;

public class SoftSkillTrainer implements ITrainer {
	public SoftSkillTrainer() {
		System.out.println(this);
	}

	@Override
	public void doTeach() {
		System.out.println("Deliver SoftSkill Training");
	}

}
