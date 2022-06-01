package com.assignmentDay7.Q3;

public abstract class Student {
	private String name;
	private String address;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public abstract double getPercentage();

	public static void getTotalNoStudents() {
			
		System.out.println(HistoryStudent.noOfStudents+ScienceStudent.noOfStudents);
	}
}
