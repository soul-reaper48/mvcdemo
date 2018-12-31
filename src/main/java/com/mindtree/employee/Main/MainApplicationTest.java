package com.mindtree.employee.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;

import com.mindtree.employee.dao.EmployeeDao;
import com.mindtree.employee.daoException.DaoExceptions;
import com.mindtree.employee.daoImpl.EmployeeDaoImpl;
import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.service.EmployeeService;
import com.mindtree.employee.serviceExceptions.ServiceExceptions;
import com.mindtree.employee.serviceImpl.EmployeeServiceImpl;

public class MainApplicationTest {

	EmployeeService empService = new EmployeeServiceImpl();
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, DaoExceptions {

//		MainApplicationTest mApp = new MainApplicationTest();
//		Employee e1 = new Employee();
//			
//			e1.setUsername("A1");
//			e1.setPassword("A1");
//			e1.setFullName("Alan");
//			e1.setEmail("aaaaa");
//			e1.setGender("M");
//			e1.setSecQuestion("Q1");
//			e1.setSecAnswer("A1");
//		
//			String add,del;
//			
//			add = mApp.empService.addEmployee(e1);
//			System.out.println(add);
			
//			del = mApp.empService.deleteEmployee("Alan");
//			System.out.println(del);
			
//			List<Employee> getAll = new ArrayList<>();
//			getAll = mApp.empService.getAllEmployee();
//			getAll.forEach(System.out::println);
			
//			Employee emp  = new Employee();
//			emp = mApp.empService.getEmployeeByName("Alan");
//			System.out.println(emp);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("src/webapp/WEB-INF/dispatcher-servelet.xml");
		
		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		
		/*Employee emp = new Employee();
		emp.setUsername("A1");
		emp.setPassword("A1");
		emp.setFullName("Alan");
		emp.setEmail("aaaaa");
		emp.setGender("M");
		emp.setSecQuestion("Q1");
		emp.setSecAnswer("A1");*/
		int msg = dao.deleteEmployee("asf");
		
		System.out.println(msg);
		
		
			
	
	}
	


}
