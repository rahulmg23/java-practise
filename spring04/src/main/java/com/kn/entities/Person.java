package com.kn.entities;

public class Person {

	String name;
	int age;
	Mobile mobile;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Mobile mobile, int age) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
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
	 * @return the mobile
	 */
	public Mobile getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", mobile=" + mobile + ", age=" + age + "]";
	}

}
