package com.kn.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	int productId;
	String productName;
	double cost;

	@ManyToOne
	Customer customter;
	public Product() {
		super();
	}

	public Product(int productId, String productName, double cost, Customer customter) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.customter = customter;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
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

	/**
	 * @return the customter
	 */
	public Customer getCustomter() {
		return customter;
	}

	/**
	 * @param customter the customter to set
	 */
	public void setCustomter(Customer customter) {
		this.customter = customter;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + ", customter="
				+ customter + "]";
	}

}
