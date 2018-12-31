package com.mindtree.employee.serviceImpl;

import java.util.List;

import com.mindtree.employee.dao.EmployeeDao;
import com.mindtree.employee.daoException.DaoExceptions;
import com.mindtree.employee.daoImpl.EmployeeDaoImpl;
import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.service.EmployeeService;
import com.mindtree.employee.serviceExceptions.ServiceExceptions;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao empDao = new EmployeeDaoImpl();
	public String addEmployee(Employee emp) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ServiceExceptions {
		try {
			return empDao.addEmployee(emp);
		} catch (DaoExceptions e) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Cannot perform add operation");
			stringBuilder.append(e.getCause());
			throw new ServiceExceptions(stringBuilder.toString());
		}
	}

	public int deleteEmployee(String name) throws ServiceExceptions {
		try {
			return empDao.deleteEmployee(name);
		} catch (DaoExceptions e) {
			throw new ServiceExceptions("Cannot perform delete operation",e);
		}
	}

	public List<Employee> getAllEmployee() throws ServiceExceptions {
		try {
			return empDao.getAllEmployee();
		} catch (DaoExceptions e) {
			throw new ServiceExceptions("Cannot perform list retrieval",e);
		}
	}

	public Employee getEmployeeByName(String name) throws ServiceExceptions {
		try {
			return empDao.getEmployeeByName(name);
		} catch (DaoExceptions e) {
			throw new ServiceExceptions("Cannot get the required employee",e);
		}
	}

}
