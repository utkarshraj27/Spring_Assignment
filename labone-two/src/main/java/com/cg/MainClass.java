package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cg.JavaConfig;
public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		 Class configurationClass=JavaConfig.class;
	     context.register(configurationClass);
	     context.refresh();
		
	     Employee em = context.getBean(Employee.class);
	     System.out.println("Employee details------------------");
		 em.display();
		
		SBU sb1 = em.getSbuDetails();
		
		MainClass mc = new MainClass();
		mc.printSbu(sb1);
		
	}
	public void printSbu(SBU sb)
	{
		System.out.println("SBUId "+ sb.getSbuId() +"SBUName "+sb.getSbuName()+"SbuHead "+sb.getSbuHead());
	}

}
