package com.kn.entities;

public class Mobile {

	String brand;
	String RAM;
	double cost;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String brand, String rAM, double cost) {
		super();
		this.brand = brand;
		RAM = rAM;
		this.cost = cost;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the rAM
	 */
	public String getRAM() {
		return RAM;
	}

	/**
	 * @param rAM the rAM to set
	 */
	public void setRAM(String rAM) {
		RAM = rAM;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", RAM=" + RAM + ", cost=" + cost + "]";
	}

}
