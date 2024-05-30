package com.kn.encapsulation;

public class ClassRoom {

	private int Temperature;
//Getter
	public int getTemperature() {
		return this.Temperature;
	}
//Setter
	public void setTemperature(int temperature) {
		
		if (temperature>=19 && temperature<=23) {
			this.Temperature = temperature;
		} else {
			System.out.println("te,p lies outside the range");
		}
	}
}
