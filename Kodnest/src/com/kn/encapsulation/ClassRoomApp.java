package com.kn.encapsulation;

public class ClassRoomApp {

	public static void main(String[] args) {
		ClassRoom c1 = new ClassRoom();
		System.out.println("original temp =" +c1.getTemperature());
		c1.setTemperature(200);
		System.out.println("modified temp=" +c1.getTemperature());
	}
}
