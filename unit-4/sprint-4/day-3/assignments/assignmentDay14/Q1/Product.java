package com.assignmentDay14.Q1;

public class Product  implements Runnable{
	int sum=1;
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			this.sum*=i;
//			System.out.println(sum);
		}
		
	}

}
