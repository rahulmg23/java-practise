package com.kn.beans;

public class Laptop {
	String manufacture;
	double cost;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String manufacture, double cost) {
		super();
		this.manufacture = manufacture;
		this.cost = cost;
	}

	/**
	 * @return the manufacture
	 */
	public String getManufacture() {
		return manufacture;
	}

	/**
	 * @param manufacture the manufacture to set
	 */
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
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
		return "Laptop [manufacture=" + manufacture + ", cost=" + cost + "]";
	}

}
