package com.excelr.basic;

public class TrainersFactory {
	public TrainersFactory() {
		System.out.println(this);
	}

	// trainer object is a dependent object
	private ITrainer trainer; // HAS A Relation

	// Instead of Creating a Dependent Object
	// I Am Pushing -Injecting The Dependent Object
	/**
	 * @param trainer
	 *            the trainer to set
	 */
	public void setTrainer(ITrainer trainer) {
		this.trainer = trainer;
	}

	public void deliverTraining() {
		// trainer = new TechnicalTrainer();
		// trainer = new SoftSkillTrainer();
		// trainer = new DomainTrainer();
		trainer.doTeach();
	}

}
