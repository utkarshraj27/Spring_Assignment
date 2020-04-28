package com.cg;

import java.util.Iterator;
import java.util.List;
import com.cg.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configureclass = JavaConfig.class;
		context.register(configureclass);
		context.refresh();
		
		SBU sb1 = context.getBean(SBU.class);
		sb1.sbuDetails();
		List<Employee> list = sb1.getEmpList();
		MainClass mc = new MainClass();
		mc.printEmployees(list);
		
		
	}
	public static void printEmployees(List<Employee> list)
	{
		for (Employee employee : list) {
			
			System.out.println("EmpId "+employee.getEmployeeId()+"EmpName "+employee.getEmployeeName()+"EmpSalary "+employee.getEmployeeSalary());
		}
	}
}
