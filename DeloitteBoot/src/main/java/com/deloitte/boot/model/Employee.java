package com.deloitte.boot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int id;
	String empId;
	private String empName;
	private float sal;
	@DateTimeFormat (pattern="yyyy-MM-dd")
	LocalDate dob;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int empId) {
		this.id = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
    @Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}
	public Employee(String empId, String empName, float sal, LocalDate dob) {
		
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.dob = dob;
	}

	
}
