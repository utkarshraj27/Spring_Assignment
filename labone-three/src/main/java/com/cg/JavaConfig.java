package com.cg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cg")
@PropertySource("classpath:employees.properties")

public class JavaConfig {
	@Bean
	public SBU sbu()
	{
		Employee employee = new Employee();
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(employee);
		SBU sb = new SBU();
		sb.setEmpList(emp);
		return sb;
		
	}
	

}
