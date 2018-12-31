package com.mindtree.employee.entity;

import java.sql.Date;

public class Employee {

	private String username;
	private String password;
	private String fullName;
	private String email;
	private String dob;
	private String gender;
	private String secQuestion;
	private String secAnswer;
	
	public Employee() {}

	public Employee(String username, String password, String fullName, String email, String dob, String gender,
			String secQuestion, String secAnswer) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.secQuestion = secQuestion;
		this.secAnswer = secAnswer;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSecQuestion() {
		return secQuestion;
	}

	public void setSecQuestion(String secQuestion) {
		this.secQuestion = secQuestion;
	}

	public String getSecAnswer() {
		return secAnswer;
	}

	public void setSecAnswer(String secAnswer) {
		this.secAnswer = secAnswer;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", fullName=" + fullName + ", email="
				+ email + ", dob=" + dob + ", gender=" + gender + ", secQuestion=" + secQuestion + ", secAnswer="
				+ secAnswer + "]";
	}
	
}
