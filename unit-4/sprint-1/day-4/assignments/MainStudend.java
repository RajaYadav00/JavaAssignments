package com.assignmentsDay4;

public class MainStudend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setName("Raja");
		s1.setAge(28);
		s1.setMarks(200);
		s1.setRoll(142);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getRoll());
		System.out.println(s1.getMarks());
	System.out.println("=========================");	
		Student s2=new Student(163,"Najmus",23,400);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getRoll());
		System.out.println(s2.getMarks());
		
		
	}

}
