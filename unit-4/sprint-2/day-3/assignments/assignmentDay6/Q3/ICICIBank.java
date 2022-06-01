package com.assignmentDay6.Q3;

public class ICICIBank extends Bank{
	
    private	double rateOfInterest; 

	@Override
	 void	displayDetails() {
		 System.out.println("Branch Name :"+this.getBranchName());
		 System.out.println("IFSC code :"+this.getIfscCode());
		 System.out.println("rate of intrest :"+this.rateOfInterest);
	 }

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

}
