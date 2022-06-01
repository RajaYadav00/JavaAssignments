package com.unit4Evaluation2Q1;

public class PermanentEmployee extends Employee {
	private double basicPay;

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public PermanentEmployee(int employeeId,String employeeName,double basicPay) {
		 	super(employeeId,employeeName);
		this.basicPay=basicPay;
	}
	@Override
	void calculateSalary() {
		double Pfamount=this.basicPay*0.12;
		double salary=this.basicPay-Pfamount;
	}
}
