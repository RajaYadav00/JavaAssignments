package com.assignmentsDay4;

public class Student2 {
	
	int roll;
	String name;
	String address;
	String collegeName;
	public Student2(int roll,String name,String address) {
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collegeName="NIT alahabad";
	}
	public Student2(int roll,String name,String address,String collegeName) {
		  this.roll=roll;
		  this.name=name;
		  this.address=address;
		  this.collegeName=collegeName;
		 
	}
	public static Student2 getStudent(boolean isFromNIT) {
		if(isFromNIT==true) {
			Student2 s2=new Student2(142,"Raja","allahabad");
			return s2;
		}else {
			Student2 s3=new Student2(143,"Najmus","delhi","JNU");
			return s3;
		}
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Student2 data;
//			data=getStudent(false);
//			System.out.println(data.roll);
//			System.out.println(data.name);
//			System.out.println(data.address);
//			System.out.println(data.collegeName);
	}
	

}
