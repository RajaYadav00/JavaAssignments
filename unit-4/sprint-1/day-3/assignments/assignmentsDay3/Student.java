package com.assignmentsDay3;

public class Student {
	int roll;
	String name;
	int marks;
	void displayStudentDetails() {
		System.out.println("Roll is "+roll);
		System.out.println("Name is "+name);
		System.out.println("Marks is "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student();
		Student student2=new Student();
		
		student1.roll=142;
		student1.name="raja Yadav";
		student1.marks=77;
		System.out.println("....student 1st data...");
		student1.displayStudentDetails();
		student2.roll=142;
		student2.name="Nazmus";
		student2.marks=90;
		System.out.println("...student 2st data.....");
		student2.displayStudentDetails();
		student1=null;
		student2=null;
	}

}
