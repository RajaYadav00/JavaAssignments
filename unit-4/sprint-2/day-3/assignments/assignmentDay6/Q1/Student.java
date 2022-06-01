package com.assignmentDay6.Q1;

public class Student {
	int studId ;
	String studName;
	double examFee;
	
     void displayDetails() {
    	 System.out.println("student Id "+this.studId);
    	 System.out.println("student Name "+this.studName);
    	 System.out.println("student exam fee "+this.examFee);
    	
    	 
     }
     
     double payFee() {
    	 
    	return this.examFee;
     }

	
	
	

}
