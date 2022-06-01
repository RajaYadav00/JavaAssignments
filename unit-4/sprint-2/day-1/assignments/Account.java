package com.assignmentsDay5;

import java.util.Scanner;

public class Account {
	
	private int accountId;
	private String accountType;
	private int balance;
	
	 public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int account) {
		this.accountId = account;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>0) {
			this.balance = balance;
		}else {
			System.out.println("Balance should be positive ");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter balance:");
			 int bal=scan.nextInt();
			 this.balance=bal;
	
		}
		
	}
	public boolean withdraw(int withdrow) {
		 if(this.balance>withdrow) {
			 this.balance-=withdrow;
			 System.out.println("Balance amount after withdraw:"+this.balance);
			 return true;
		 }else {
			 System.out.println( "Sorry!!! No enough balance");
			 return false;
		 }
	 }
	

}
