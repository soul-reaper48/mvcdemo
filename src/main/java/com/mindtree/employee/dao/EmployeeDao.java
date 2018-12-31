package com.mindtree.employee.dao;

import java.util.List;

import com.mindtree.employee.daoException.DaoExceptions;
import com.mindtree.employee.entity.Employee;

public interface EmployeeDao {

	String addEmployee(Employee emp) throws ClassNotFoundException, InstantiationException, IllegalAccessException, DaoExceptions;
	int deleteEmployee(String name) throws DaoExceptions;
	List<Employee> getAllEmployee() throws DaoExceptions;
	Employee getEmployeeByName(String name) throws DaoExceptions;
}
