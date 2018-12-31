package com.mindtree.employee.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {

	 private static Connection con = null;
	 private static String url = "jdbc:mysql://localhost:3306/emp_db";
	 private static String uname = "root";
	 private static String pass = "Welcome123";
	
	 public static Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		try {
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url,uname,pass);
			if(con != null)
				System.out.println("Connected Successfully!");
			else
				System.out.println("Cannot connect to DB!");
			
		}catch(SQLException e)
		{
			System.out.println("Couldn't connect to Database"+e.getMessage());
		}
		return con;
	}
	 
	 public static void closeConnection(Connection con) throws SQLException {
		 con.close();
	 }

}
