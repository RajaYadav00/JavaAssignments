package com.assignmentDay9.Q1;

public class Account {

	final String accountNumber;
	double balance;

	public Account(String x) {
		accountNumber = x;
	}

	public void deposit(double amount) {

		this.balance = amount;
	}

	public double withdraw(double amount) throws InsufficientFundsException {

		double withdraw = 0;
		if (balance >= amount) {

			withdraw = balance - amount;

		} else {
			InsufficientFundsException eh = new InsufficientFundsException("you dont have enough balance");

			throw eh;
		}

		return withdraw;
	}

}
