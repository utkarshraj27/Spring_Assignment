package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class SBU {
	@Value("${scode}")
	private int sbuCode;
	@Value("${sname}")
	private String sbuName;
	@Value("${shead}")
	private String sbuHead;
	private List<Employee> empList;
	public int getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	@Autowired
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void sbuDetails()
	{
		System.out.println("SBU Details are-----------");
		System.out.println("SbuCode "+sbuCode+"SbuName "+sbuName+"sbuHead "+sbuHead);
	}
	
}
