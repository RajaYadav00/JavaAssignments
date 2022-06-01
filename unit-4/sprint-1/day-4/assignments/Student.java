package com.assignmentsDay4;

public class Student {
      
	private int roll;
	private String name;
	private int age;
	private  int marks;
	



	public int getRoll() {
		return roll;
	}




	public void setRoll(int roll) {
		if(roll>0||roll<500) {
		this.roll = roll;
		}else {
			System.out.println("enter valid rollNumber");
		}
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		if(age>18&&age<60) {
		this.age = age;
		}else {
			System.out.println("not valid age");
		}
	}




	public int getMarks() {
		return marks;
	}




	public void setMarks(int marks) {
		if(marks>0&&marks<500) {
		this.marks = marks;
		}else {
			System.out.println("Not a valid marks");
		}
	}

 public Student() {
	 
 }


	public Student(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}




	

}
