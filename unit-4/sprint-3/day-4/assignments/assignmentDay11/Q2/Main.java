package com.assignmentDay11.Q2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Employee> emp=new TreeSet<>();
		

		System.out.println("enter details of  5  employee");
		for(int i=1;i<=4;i++) {
			System.out.println("enter detail of  "+i+"   employ");
			System.out.println("enter emp id ");
			int roll=sc.nextInt();
			System.out.println("enter name ");
			String name=sc.next();
			System.out.println("enter salary");
			double sal=sc.nextDouble();
			emp.add(new Employee(roll,name,sal));
			
			
		}
		for(Employee e:emp) {
			System.out.println(e);
		}
	}

}
