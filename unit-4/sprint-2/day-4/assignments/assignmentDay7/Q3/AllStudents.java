package com.assignmentDay7.Q3;

import java.util.Scanner;

public class AllStudents {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter (1) for science and (2) for history student");
		
		int x=scan.nextInt();
		
		if(x==1) {
			
			System.out.println("science student");
			
			System.out.println();
			System.out.println("enter Name");
			String temp=scan.nextLine();
			String name=scan.nextLine();
			System.out.println("enter address");
			String address=scan.nextLine();
			System.out.println("enter physics mark");
			double physics=scan.nextDouble();
					System.out.println("enter chemistry mark");
			double chemistry=scan.nextDouble();
					System.out.println("enter maths mark");
			double maths=scan.nextDouble();
			
			ScienceStudent science=new ScienceStudent(name,address,physics,chemistry,maths);
			ScienceStudent.noOfStudents+=1;
			
			double per=science.getPercentage();
			System.out.println(per);
			
		}else if(x==2) {
			
			System.out.println("History student");
			System.out.println();
			System.out.println("enter Name");
			String temp=scan.nextLine();
			String name=scan.nextLine();
			System.out.println("enter address");
			String address=scan.nextLine();
			
			System.out.println("enter history mark");
	        double hist=scan.nextDouble();
			System.out.println("enter civicMarks mark");
			double civic=scan.nextDouble(); 
			HistoryStudent history=new HistoryStudent(name,"adddress",hist,civic);
			double perc=history.getPercentage();
			System.out.println(perc);
		}
		
		
		
		ScienceStudent.getTotalNoStudents();
	}

}
