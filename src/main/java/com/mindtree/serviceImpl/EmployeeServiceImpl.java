package com.mindtree.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.entity.EmployeeEntity;
import com.mindtree.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void addEmployee(EmployeeEntity employee) {
			employeeDao.addEmployee(employee);
		
	}

	public List<EmployeeEntity> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public void deleteEmployee(Integer employeeId) {
		employeeDao.deleteEmployee(employeeId);
		
	}

}
