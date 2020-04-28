package com.mycompany.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${empid}")
	
	
	private int empid;
	@Value("${empname}")
	private String empname;
	@Value("${empsalary}")
	private double empsalary;
	@Value("${bu}")
	private String bu;
	@Value("${empage}")
	private int empage;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	public Employee(int empid, String empname, double empsalary, String bu, int empage) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.bu = bu;
		this.empage = empage;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}

}
