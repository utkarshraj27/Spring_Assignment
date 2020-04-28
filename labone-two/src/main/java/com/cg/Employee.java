package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component

public class Employee {
	@Value("${id}")
	private int employeeId;
	@Value("${name}")
	private String employeeName;
	@Value("${salary}")
	private double salary;
	private SBU businessUnit;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	@Autowired
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(SBU businessUnit) {
		this.businessUnit=businessUnit;
	}
	public void display()
	{
		System.out.println("ID "+employeeId+" EmpName "+employeeName+"Salary "+salary);
	}
	
	public SBU getSbuDetails()
	{
		SBU sb=new SBU();
		sb.setSbuId(201);
		sb.setSbuName("Product Engineering Services");
		sb.setSbuHead("Kiran Rao");
		return sb;
	}
	

}
