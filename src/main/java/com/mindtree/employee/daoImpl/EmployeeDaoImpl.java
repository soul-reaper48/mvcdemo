package com.mindtree.employee.daoImpl;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mindtree.employee.DbUtil.DbUtil;
import com.mindtree.employee.dao.EmployeeDao;
import com.mindtree.employee.daoException.DaoExceptions;
import com.mindtree.employee.entity.Employee;


public class EmployeeDaoImpl implements EmployeeDao {

	private Connection con = null;
	private PreparedStatement ps = null;
	private Statement st = null;
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  

	
	public String addEmployee(Employee emp) throws ClassNotFoundException, InstantiationException, IllegalAccessException, DaoExceptions {
		
		
		String query = "insert into employee values (?,?,?,?,?,?,?,?)";
		String msg = "";
		try 
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, emp.getUsername());
			ps.setString(2, emp.getPassword());
			ps.setString(3, emp.getFullName());
			ps.setString(4, emp.getEmail());
			ps.setString(5,  emp.getDob());
			ps.setString(6, emp.getGender());
			ps.setString(7, emp.getSecQuestion());
			ps.setString(8, emp.getSecAnswer());
			int check = ps.executeUpdate();
			if(check > 0)
				msg = "Employee added";
			else
				msg = "Cannot add employee details";
			ps.close();
		} catch (Exception e) {
			throw new DaoExceptions(msg,e);
		}
		return msg;
	}

	public int deleteEmployee(String name) throws DaoExceptions {
		
		String query = "delete from employee where fullName = \'"+name+"\'";
		int msg = jdbcTemplate.update(query);
		return msg;
		/*String query = "delete from employee where fullName = \'"+name+"\'";
		String msg = "";
		try 
		{
			con = DbUtil.getConnection();
			st = con.createStatement();
			int rs = st.executeUpdate(query);
			if(rs > 0)
				msg = "Deleted!!";
			else
				msg = "Couldn't delete";
		} catch (Exception e) {
			throw new DaoExceptions(msg,e);
		}
		return msg;*/
	}

	public List<Employee> getAllEmployee() throws DaoExceptions {
		String query = "select * from employee";
		Employee emp;
		List<Employee> getAllDet = new ArrayList<>();
		getAllDet.removeAll(getAllDet);
		
		try 
		{
			con = DbUtil.getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				emp = new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				getAllDet.add(emp);
			}
			st.close();
			con.close();
		} catch (Exception e) {
			throw new DaoExceptions("Cannot get the list of employees",e.getCause());
		}
		return getAllDet;
	}

	public Employee getEmployeeByName(String name) throws DaoExceptions {
		String query = "select * from employee where fullName = \'"+name+"\'";
		Employee emp = new Employee();
		try 
		{
			con = DbUtil.getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				emp = new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
			}
		} catch (Exception e) {
			throw new DaoExceptions("Cannot delete employee",e);
		}
		return emp;
	}

}
