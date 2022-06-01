package com.unit4Evaluation3Q4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CastVote {
	
	public void checkToVote(String date) {
		try {
			LocalDate dob=LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			LocalDate current=LocalDate.now();
			
			Period age=Period.between(dob, current);
			if(age.getYears()>=18) {
				if(dob.getMonth()==current.getMonth()&& dob.getDayOfMonth()==current.getDayOfMonth()) {
					System.out.println("Happy Birthday, You are eligible to cast your vote.");
				}else {
					System.out.println("You are eligible to cast your vote");
				}
			}else if(dob.isAfter(current)) {
				System.out.println(" ”Date of birth should not bein future");
			}
			
		} catch (Exception e) {
			System.out.println("please pass the date in the proper format");
		}
		
		
		
	}
	public static void main(String[] args) {
		CastVote cv=new CastVote();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Date of birth");
		String dob=sc.next();
		
		
			cv.checkToVote(dob);
		
		
	}
}
