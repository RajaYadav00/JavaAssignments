package com.assignmentDay6.Q3;

public class AxisBank extends Bank{
private	double rateOfInterest;

	public double getRateOfInterest() {
	return rateOfInterest;
}
public void setRateOfInterest(double rateOfInterest) {
	this.rateOfInterest = rateOfInterest;
}
	@Override
	 void	displayDetails() {
		 System.out.println("Branch Name :"+this.getBranchName());
		 System.out.println("IFSC Code  :"+this.getIfscCode());
		 System.out.println("Rate Of interest  :"+this.rateOfInterest);
		 
//		 getCreditCard();
	 }
	void getCreditCard(){
		System.out.println("Get the Credit Card from the Axis bank");
	}

}
