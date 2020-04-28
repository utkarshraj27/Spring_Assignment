package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cap.dao.IEmployeeDao;
import com.cap.entities.Employee;
@Component
public class EmployeeServiceImpl implements IEmployeeService
{
	private IEmployeeDao dao;
	
	
	public IEmployeeDao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(IEmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public Employee findById(int id)
	{
		Employee emp = dao.findById(id);
		return emp;
	}

		
	
}
