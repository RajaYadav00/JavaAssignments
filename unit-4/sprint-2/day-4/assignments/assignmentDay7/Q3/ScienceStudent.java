package com.assignmentDay7.Q3;

public class ScienceStudent extends Student{
	double phisicsMarks;
	double chemistryMarks;
	double mathsMarks;
	static int noOfStudents;
	
	public ScienceStudent( String name,String address,double ph,double chem,double math) {
		
		super(name,address);
		
		this.phisicsMarks=ph;
		this.chemistryMarks=chem;
		this.mathsMarks=math;
	}
	
	@Override
	public double getPercentage() {
		
		double total=this.phisicsMarks+this.chemistryMarks+this.mathsMarks;
		double per=(total/300.00)*100.00;
		return per;
	}

}
