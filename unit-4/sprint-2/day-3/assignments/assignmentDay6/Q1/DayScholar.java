package com.assignmentDay6.Q1;

import java.util.Scanner;

public class DayScholar extends Student {
	
	 double transportFee;
	
	 @Override
	 void displayDetails() {
    	 System.out.println("student Id "+this.studId);
    	 System.out.println("student Name "+this.studName);
    	 System.out.println("student exam fee "+(this.examFee+this.transportFee));
    	 
    	
    	 
     }@Override
	 double payFee() {
    	 
    	 double totalfee=this.transportFee+this.examFee;
    	 
    	 Scanner scan=new Scanner(System.in);
    	 
    	 System.out.println("Enter fee to be paide");
    	 
    	  double fee=scan.nextDouble();
    	  
    	   double rFee=totalfee-fee;
    	   
    	 return rFee;
     }
	

}
