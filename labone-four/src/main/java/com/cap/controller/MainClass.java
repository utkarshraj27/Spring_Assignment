package com.cap.controller;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cap.config.JavaConfig;
import com.cap.entities.Employee;
import com.cap.service.IEmployeeService;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configuration = JavaConfig.class;
		context.register(configuration);
		context.refresh();
		
		IEmployeeService service = context.getBean(IEmployeeService.class);
		
		System.out.println("Enter the Id");
		int k = sc.nextInt();
		Employee employee = service.findById(k);
		System.out.println("Employee Info------");
		System.out.println("Employee Id "+employee.getId());
		System.out.println("Employee Name "+employee.getEmpname());
		System.out.println("Employee Salary "+employee.getEmpsalary());
		
		
		
		
		
	}
	
	
}
