package com.assignmentDay7.Q2;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private double marks;
	private char grade;
	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Student() {
		
	}
	
	public Student(int roll,String name,double marks) {
		    this.roll=roll;
		    this.name=name;
		    this.marks=marks;
	}
//	perticular mathods starts

	public void displayDetails() {
//		System.out.println("Student roll :"+this.roll);
//		System.out.println("Student Name  :"+this.name);
//		System.out.println("Student marks :" +this.marks);
//		System.out.println("Student Grade :"+this.grade);
		Scanner sc=new Scanner(System.in);
		System.out.println(" Entaer Student roll :");
		int roll=sc.nextInt();
		System.out.println("Student Name  :");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Student marks :");
		double marks=sc.nextDouble();
		
		Student s=new Student(roll,name,marks);
		s.calculateGrade();
		System.out.println(s);

	}

	private char calculateGrade() {
		
	    if (this.marks>= 500) {
	    	this.grade='A';
	    }
	    else if (this.marks < 500 && this.marks>= 400){
		 this.setGrade('B');
	 }
	    else {
	    	this.setGrade('C');
	    }
	    return this.grade;
	 }

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	

}
