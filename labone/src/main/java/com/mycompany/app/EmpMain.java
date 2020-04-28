package com.mycompany.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mycompany.app.*;

public class EmpMain {
	public static void main(String[] args) {
		  
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp=context.getBean(Employee.class);
		
		System.out.println("EmployeeId is "+emp.getEmpid());
		System.out.println("Employee Name is "+emp.getEmpname());
		System.out.println("Employee Salary is "+emp.getEmpsalary());
		System.out.println("Employee Buisness unit is "+emp.getBu());
		System.out.println("Employee Age is "+emp.getEmpage());
		
		
		
		
		
	}

}
