package com.assignmentsDay10.Q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeBonus {
	
	public double bonuscalculator(String date) throws InvalidAge {
		double bonus=0;
		try {
			LocalDate currentDate=LocalDate.now();
			LocalDate joiningDate=LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			Period exp=Period.between(joiningDate,currentDate);
			double ex=exp.getYears();
			System.out.println();
			
			if(joiningDate.isAfter(currentDate)) {
				InvalidAge eb1=new InvalidAge("Age should not be in the future ");
				throw eb1;
				
			}
			else if(ex>0&&ex<1) {
				bonus=5000;
			}else if(ex>1&&ex<2) {
				bonus=8000;
			}else if(ex>2) {
				bonus=10000;
			}
			
			
		} catch (Exception e) {
			InvalidAge eb2=new InvalidAge("Please enter correct formate");
			throw eb2;
		}
	
		return bonus;
	}

	public static void main(String[] args) {
		EmployeeBonus eb=new EmployeeBonus();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date of joining (dd-MM-yyyy)");
		String date=sc.next();
		
		try {
			double bonus=eb.bonuscalculator(date);
			System.out.println("THE BONUS IS  "+bonus);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		System.out.println("main executed gracefully");
	}
}
