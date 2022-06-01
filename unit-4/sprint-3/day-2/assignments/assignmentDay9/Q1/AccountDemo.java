package com.assignmentDay9.Q1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter account number");
		String acno=sc.next();
		Account ac=new Account(acno);
		System.out.println("Enter amount to be depositet");
		double jama=sc.nextDouble();
		ac.deposit(jama);
		System.out.println("enter ammount to be with drow");
		
		double wtd=sc.nextDouble();
		
		try {
			double paisa=ac.withdraw(wtd);
			System.out.println("Balance amount "+paisa);
			
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
//			System.out.println("exception handled");
			
		}
		System.out.println("main program executed normaly");
	}

}
