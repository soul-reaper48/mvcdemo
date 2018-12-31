package com.mindtree.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.employee.dao.EmployeeDao;
import com.mindtree.employee.daoImpl.EmployeeDaoImpl;
import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.service.EmployeeService;
import com.mindtree.employee.serviceExceptions.ServiceExceptions;
import com.mindtree.employee.serviceImpl.EmployeeServiceImpl;

@Controller
public class ControllerCore {
	private EmployeeService es = new EmployeeServiceImpl();
	private EmployeeDao dao = new EmployeeDaoImpl();

	@RequestMapping("/")
	public ModelAndView firstPage() {
		String msg = "Welcome";
		return new ModelAndView("index","message",msg);
	}
	
	@RequestMapping("/emp")
	public ModelAndView empForm() {
		String msg = "Welcome";
		return new ModelAndView("empform","message",msg);
	}
	
	@RequestMapping(value="/addEmp",method=RequestMethod.POST)
	public ModelAndView addEmpToDb(@Validated @ModelAttribute("emp") Employee emp,Model model) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ServiceExceptions {
		String adding = "";
		try {
			String employee = emp.toString();
			System.out.println(employee);
			adding = es.addEmployee(emp);
			System.out.println(adding);
		} catch (Exception e) {
			System.out.println("Couldn't add details from controller!"+e);
		}
		return new ModelAndView("addEmp","message",adding);
	}
	
	
	
	@RequestMapping(value="/showEmployees")
	public ModelAndView getEmpFromDb() throws ServiceExceptions{
		
		ModelAndView modView = new ModelAndView();
		List<Employee> getAll = new ArrayList<>();
		getAll = es.getAllEmployee();
		getAll.forEach(System.out::println);
		
		modView.setViewName("showEmployees");
		modView.addObject("emp",getAll);
		return modView;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteEmpName() {
		String msg = "Welcome";
		return new ModelAndView("deleteEmp","message",msg);
	}
	
	@RequestMapping(value="/deletedEmp",method=RequestMethod.POST)
	public ModelAndView deleteEmpFromDb(@RequestParam("fullName") String name) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ServiceExceptions {
		int del = 0;
		try {
			del = dao.deleteEmployee(name);
			System.out.println(del);
		} catch (Exception e) {
			System.out.println("Couldn't delete employee from controller!"+e);
		}
		return new ModelAndView("addEmp","message",del);
	}
	
	@RequestMapping("/showEmpByName")
	public ModelAndView showEmpName() {
		String msg = "Welcome";
		return new ModelAndView("getByName","message",msg);
	}
	
	@RequestMapping(value="/showByName",method=RequestMethod.POST)
	public ModelAndView getEmpByName(@RequestParam("fullName") String name) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ServiceExceptions {
		Employee emp = null;
		String empToStr = "";
		try {
			emp = es.getEmployeeByName(name);
			empToStr = emp.toString();
			System.out.println(emp);
		} catch (Exception e) {
			System.out.println("Couldn't get employee from controller!"+e);
		}
		return new ModelAndView("addEmp","message",empToStr);
	}
	
	@RequestMapping("/indx")
	public ModelAndView BackToIndex() {
		String msg = "";
		return new ModelAndView("index","message",msg);
	}
	
	
}
