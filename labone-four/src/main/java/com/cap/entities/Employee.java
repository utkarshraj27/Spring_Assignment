package com.cap.entities;

public class Employee {
	
	private int id;
	private String empname;
	private double empsalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String empname, double empsalary) {
		super();
		this.id = id;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	

}
