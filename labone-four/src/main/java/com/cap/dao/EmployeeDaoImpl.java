package com.cap.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cap.entities.Employee;
@Component
public class EmployeeDaoImpl implements IEmployeeDao  {
	
	Map<Integer, Employee> map = new HashMap<>();

	public EmployeeDaoImpl() {
		map.put(100, new Employee(100,"Rama",12345.67));
		map.put(101, new Employee(101,"Shiva",98765.43));
	}

	@Override
	public Employee findById(int id) {
		Employee employee =null;
		employee=map.get(id);
		return employee;
	}
	
	
	
	
	
	
	

}
