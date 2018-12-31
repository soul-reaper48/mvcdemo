package com.mindtree.employee.service;

import java.util.List;

import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.serviceExceptions.ServiceExceptions;

public interface EmployeeService {

	String addEmployee(Employee emp) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ServiceExceptions;
	int deleteEmployee(String name) throws ServiceExceptions;
	List<Employee> getAllEmployee() throws ServiceExceptions;
	Employee getEmployeeByName(String name) throws ServiceExceptions;
	
}
