package com.assignmentDay7.Q3;

public class HistoryStudent extends Student {
//	public HistoryStudent(String name, String address) {
//		super(name, address);
//		// TODO Auto-generated constructor stub
//	}

	double historyMarks;
	double civicsMarks;
	static int noOfStudents;
	
	public HistoryStudent(String name,String address,double his,double civic) {
		super(name,address);
		
		this.historyMarks=his;
		this.civicsMarks=civic;
		
	}

	@Override
	public double getPercentage() {
		double total=this.historyMarks+this.civicsMarks;
		double per=(total/200)*100;
		
		return per;

	}

}
