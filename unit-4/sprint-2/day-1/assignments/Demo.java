package com.assignmentsDay5;

import java.util.Scanner;

public class Demo {
	
	public static Student crateOneObj(int roll,String name,String adddress,int marks) {
		 
		  Student st=new Student();
		  st.setRoll(roll);
		  st.setName(name);
		  st.setAddress(adddress);
		  st.setMarks(marks);
		  
		  return st;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter NO. of students Data");
		 
		 int numLength=scan.nextInt();
		 
		 Student[] studentArr=new Student[numLength];
		 
		 for(int i=0;i<numLength;i++) {
			 System.out.println("Enter Name");
			 String name=scan.next();
			 System.out.println("enster roll number");
			 
			 int roll=scan.nextInt();
			 System.out.println("enter address");
			 String add=scan.next();
			 
			 System.out.println("enter marks");
			 int marks=scan.nextInt();
			 
			Student s1= crateOneObj(roll,name,add,marks);
			studentArr[i]=s1;
			 
			 
		 }
//		 System.out.println(studentArr);
	double total=0;
	for( int i=0;i<numLength;i++) {
		
		System.out.println("roll :"+studentArr[i].getRoll());
		System.out.println("Name :"+studentArr[i].getName());
		System.out.println("address :"+studentArr[i].getMarks());
		total+=studentArr[i].getMarks();
	}
	System.out.println("Avarage marks"+total/numLength);;
	}
}
