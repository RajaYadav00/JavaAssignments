package com.assignmentDay13.Q2;

public class Student {
	  private int roll;
	  private String name;
	  private int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [roll=").append(roll).append(", name=").append(name).append(", marks=").append(marks)
				.append("]");
		return builder.toString();
	}
	
	
	  
}
