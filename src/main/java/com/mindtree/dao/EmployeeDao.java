package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.EmployeeEntity;

public interface EmployeeDao {

	public void addEmployee(EmployeeEntity employee);

	public List<EmployeeEntity> getAllEmployees();

	public void deleteEmployee(Integer employeeId);
}
