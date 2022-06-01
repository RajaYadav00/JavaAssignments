package com.assignmentsDay4;

public class Demo {
	
	public Demo(){
		this("Raja");
		System.out.println("inside Demo()");
	}
	public Demo(String s) {
		this(142);
		System.out.println("inside Demo(String s):"+s);
	}
	public Demo(int i) {
		this( 55.4f);
		System.out.println("inside Demo(int i)"+i);
	}
	public Demo(float f) {
		System.out.println("inside(float f)"+f);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		Student2 data;
    System.out.println("=================");
 		data=Student2.getStudent(false);
 		System.out.println(data.roll);
		System.out.println(data.name);
		System.out.println(data.address);
		System.out.println(data.collegeName);
		System.out.println("==================");
		data=Student2.getStudent(true);
		System.out.println(data.getRoll());
		System.out.println(data.getName());
		System.out.println(data.getAddress());
		System.out.println(data.getCollegeName());
	}

}
