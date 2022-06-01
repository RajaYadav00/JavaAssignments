package com.assignmentsDay10.Q1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.assignmentDay9.Q1.InsufficientFundsException;

public class DateOfBirth {

	public int getAge(String dob) throws InvalidDateFormate {
		
		int totalage=0;
		
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate currentdate=LocalDate.now();
			
			LocalDate date = LocalDate.parse(dob, dtf);
			
			System.out.println(date.isAfter(currentdate));
			
			Period diff=Period.between(date, currentdate);
			
			 totalage=diff.getYears();
			
			if(totalage<0) {
				System.err.println("age should not in future");
			}
			
		} catch (Exception e) {
			InvalidDateFormate eh=new InvalidDateFormate("invalid ege");
			throw eh;
		}
		
		
		
		return totalage;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateOfBirth brtd = new DateOfBirth();
		System.out.println("enter dob dd-MM-yyyy");
		
		String dob = sc.next();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		try {
			
			int age =brtd.getAge(dob);
			if(age>0) {
				System.out.println(age);
			}
			
		} catch (InvalidDateFormate e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
//			System.out.println("error");
		}
		
		System.out.println("main executed gracefully");
	}
}
