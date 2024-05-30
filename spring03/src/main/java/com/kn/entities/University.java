package com.kn.entities;

public class University {

	int id;
	String name;
	Trainer trainer;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(int id, String name, Trainer trainer) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the trainer
	 */
	public Trainer getTrainer() {
		return trainer;
	}

	/**
	 * @param trainer the trainer to set
	 */
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", trainer=" + trainer + "]";
	}
}
