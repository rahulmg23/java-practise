package com.kn.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {

	@Id
	int empId;
	String techName;
	@ManyToMany
	List<Employee> employees;

	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technology(int empId, String techName, List<Employee> employees) {
		super();
		this.empId = empId;
		this.techName = techName;
		this.employees = employees;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the techName
	 */
	public String getTechName() {
		return techName;
	}

	/**
	 * @param techName the techName to set
	 */
	public void setTechName(String techName) {
		this.techName = techName;
	}

	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Technology [empId=" + empId + ", techName=" + techName + ", employees=" + employees + "]";
	}

}
