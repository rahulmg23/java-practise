package com.hib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Studnet {
	@Id
	int id;
	String name;
	int marks;

	public Studnet() {
		super();
	}

	public Studnet(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Studnet [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
