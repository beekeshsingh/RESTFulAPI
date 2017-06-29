package com.glaucus.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "FIRST_NAME")
	private String first_name;
	@Column(name = "LAST_NAME")
	private String last_name;
	@Column(name = "SALARY")
	private double salary;

	public Employee() {

	}

	public Employee(String first_name, String last_name, double salary) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}
	
	public Employee(long id, String first_name, String last_name, double salary) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
