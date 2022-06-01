package com.assignmentsDay5;

import java.util.Scanner;

public class AccountDetails {
	
	
	
	public Account getAccountDetails() {
		Account acc=new Account();
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter account id:");
		int id=scan.nextInt();
		acc.setAccountId(id);
		System.out.println("Enter account type:");
		String accounttype=scan.next();
		acc.setAccountType(accounttype);
		System.out.println("Enter balance:");
		int bal=scan.nextInt();
		
		if(bal<0) {
			while(bal<0) {
				System.out.println("Balance should be positive ");
				System.out.println("Enter balance:");
				bal=scan.nextInt();
			}
		}
		acc.setBalance(bal);
		
		
		return acc;
	}
	public int getWithdrawAmount() {
		
        System.out.println("Enter amount to be withdrawn:");
		Scanner scan=new Scanner(System.in);
		int withdrowamt=scan.nextInt();
		if (withdrowamt<0) {
			while(withdrowamt<0) {
			System.out.println("ammount should be positive");
			System.out.println("Enter amount to be withdrawn:");
			withdrowamt=scan.nextInt();
			}
		}else {
			return withdrowamt;
		}
		return withdrowamt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myacc=new Account();
		
		AccountDetails accd1=new AccountDetails();
		
		
		myacc=accd1.getAccountDetails();
		
         int withdrowamt=accd1.getWithdrawAmount();
//         System.out.println(withdrowamt);
         myacc.withdraw(withdrowamt);
         
        
	}

}
