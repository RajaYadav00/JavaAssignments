package com.assignmentDay6.Q1;

import java.util.Scanner;

public class RunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		DayScholar dscoll=new DayScholar();
		Hosteller hosteller=new Hosteller();
		System.out.println("Enter '1' for Dayscoller and  '2' for Hosteller");
		int stType=scan.nextInt();
		
		if(stType==1) {
			System.out.println("student:- Dayscholler");
			System.out.println("");
			System.out.println("Enter student Id");
			dscoll.studId=scan.nextInt();
			System.out.println("Enter Student Name");
			String test=scan.nextLine();
			dscoll.studName=scan.nextLine();
			System.out.println("Enter student exam-fee");
			dscoll.examFee=scan.nextDouble();
			System.out.println("enter transport fee");
			dscoll.transportFee=scan.nextDouble();
			double rfee=dscoll.payFee();
			dscoll.displayDetails();
			
			System.out.println("remaining fee"+rfee);
			
			
		}
		else if(stType==2) {
			System.out.println("student:- Hosteller");
			System.out.println("");
			System.out.println("Enter student Id");
			hosteller.studId=scan.nextInt();
			System.out.println("Enter Student Name");
			String test=scan.nextLine();
			hosteller.studName=scan.nextLine();
			System.out.println("Enter student exam-fee");
			hosteller.examFee=scan.nextDouble();
			System.out.println("enter Hostell fee");
			hosteller.hostelFee=scan.nextDouble();
			double rfee=hosteller.payFee();
			hosteller.displayDetails();
			
			System.out.println("remaining fee"+rfee);
			
		}
		
	
		
		
		
		
		


		
		
		
	}

}
