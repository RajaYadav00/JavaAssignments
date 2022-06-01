package com.assignmentsDay5;

import java.util.Scanner;

public class Main {
	
	public static Employee getEmployeeDetails(int employeeId,String employeeName,double salary) {
		
		Employee e1=new Employee();
		e1.setEmployeeId(employeeId);
		e1.setEmployeeName(employeeName);
		e1.setSalary(salary);
		
		return e1;
	}
	public static int getPFPercentage(double pfPercent) {
		return (int)pfPercent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
	    System.out.println("enter employee id");
		int employeeId=input.nextInt();
		
		System.out.println("Enter employee Name");
		String employeeName=input.next();
		
		System.out.println("Enter salery");
		double salary=input.nextDouble();


	
		
	 
		 Employee   E1 = getEmployeeDetails(employeeId,employeeName,salary);
		 
	  System.out.println("Enter PF percentage");
	    
	   double pfPercent=input.nextDouble();
	   
	   int pfper=getPFPercentage(pfPercent);
	   
	   E1.calculateNetSalary(pfper);
	  
	   
	   System.out.println("Id :"+E1.getEmployeeId());
	   System.out.println("Name :"+E1.getEmployeeName());
	   System.out.println("Salary :"+E1.getSalary());
	   System.out.println("Net Slary:"+E1.getNetSalary());

	}

}
