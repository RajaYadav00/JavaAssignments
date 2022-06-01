package com.assignmentDay6.Q3;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank) {
		if(bank.equals("axis")){
				AxisBank a=new AxisBank();

				a.setBranchName("AxisBank");

				a.setIfscCode("axix00019");
				a.setRateOfInterest(8.5);
				return a;
		}else if(bank.equals("icici")) {
			ICICIBank i=new ICICIBank();

			i.setBranchName("ICICIBank");
			i.setIfscCode("icici00024");

			i.setRateOfInterest(14.3);
			
			return i;
		}else {
			return null;
		}
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank B=new Bank();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter bank name");
		
		B=getBank(scan.next());
		
		B.displayDetails();
		
		if(B instanceof AxisBank) {
			
			AxisBank a=(AxisBank)B;
			
			a.getCreditCard();
		}
		
		
		
	}

}
