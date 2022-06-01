package com.assignmentDay11.Q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		TreeSet<Members>  mb=new TreeSet<>();
		
		System.out.println("enter the member details");
		
		while(true) {
			System.out.println(" Enter memberId");
			double id=sc.nextDouble();
			System.out.println("Enter memberName");
			String name=sc.next();
			System.out.println("Enter membershipNo");
			double mbsNo=sc.nextDouble();
			
			System.out.println("Enter membershipEnddate as dd-MM-yyyy");
			String enddate=sc.next();
			LocalDate date=LocalDate.parse(enddate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			Members m=new Members(id,name,mbsNo,date);
			mb.add(m);
			System.out.println("want to add more member  y/n");
			String c=sc.next();
			if(c.equalsIgnoreCase("n")) {
				break;
			}
		}
		for(Members x:mb) {
			System.out.println(x.getMemberId());
			System.out.println(x.getMemberName());
			System.out.println(x.getMembershipNo());
			System.out.println(x.getMembershipEnddate());
			
			System.out.println("------------------");
		}
	}

}
