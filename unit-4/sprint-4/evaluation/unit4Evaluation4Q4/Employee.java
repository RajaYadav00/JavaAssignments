package com.unit4Evaluation4Q4;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", empName=").append(empName).append(", salary=")
				.append(salary).append("]");
		return builder.toString();
	}
	

}
