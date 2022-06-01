package com.unit4Evaluation4Q3;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empId;
	private String empName;
	private String email;
	private transient String password;

	private transient  Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String email, String password, com.unit4Evaluation4Q3.Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", empName=").append(empName).append(", email=")
				.append(email).append(", password=").append(password).append(", address=").append(address).append("]");
		return builder.toString();
	}

	
	
	

}
