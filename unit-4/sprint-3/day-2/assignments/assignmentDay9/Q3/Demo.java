package com.assignmentDay9.Q3;

import java.util.Scanner;

public class Demo {
	
	public void showDetails(Month m) {
		
		
			Month month = m;
			
			switch (month) {
			case JANUARY:
				System.out.println("This is the 1st Month of the Year January");
				break;
			case FEBRUARY:
				System.out.println("This is the 2ND Month of the Year January");
				break;
			case MARCH:
				System.out.println("This is the 3rd Month of the Year January");
				break;
			case APRIL:
				System.out.println("This is the 4rth Month of the Year January");
				break;
			case MAY:
				System.out.println("This is the 5th Month of the Year January");
				break;
			case JUN:
				System.out.println("This is the 6th Month of the Year January");
				break;
			case JULLY:
				System.out.println("This is the 7th Month of the Year January");
				break;
			case AUGUST:
				System.out.println("This is the 8th Month of the Year January");
				break;
			case SEPTEMBER:
				System.out.println("This is the 9th Month of the Year January");
				break;
			case OCTOBER:
				System.out.println("This is the 10th Month of the Year January");
				break;
			case NOVEMBER:
				System.out.println("This is the 11th Month of the Year January");
				break;
			case DECEMBER:
				System.out.println("This is the 12th Month of the Year January");
				break;
			}
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Demo d=new Demo();
		
		System.out.println("Enter the name of month");
		
		String m=sc.next().toUpperCase();
		try {
			Month month=Month.valueOf(m.toUpperCase());
			
			d.showDetails(month);
		} catch (Exception e) {
			System.out.println(" Invalid Month Name");
		}
		
		
	}

}
