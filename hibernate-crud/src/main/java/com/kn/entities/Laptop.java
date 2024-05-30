package com.kn.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int laptopId;
	String brandName;
	double cost;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int laptopId, String brandName, double cost) {
		super();
		this.laptopId = laptopId;
		this.brandName = brandName;
		this.cost = cost;
	}

	/**
	 * @return the laptopId
	 */
	public int getLaptopId() {
		return laptopId;
	}

	/**
	 * @param laptopId the laptopId to set
	 */
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
		return "Laptop [laptopId=" + laptopId + ", brandName=" + brandName + ", cost=" + cost + "]";
	}

}
