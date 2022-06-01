package com.assignmentDay14.Q1;

public class Main {

	public static void main(String[] args) {
		Product p=new Product();
		
		Thread t1=new Thread(p);
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		int product=p.sum;
		
		System.out.println("priduct of 10 digits is ="+product);

	}

}
