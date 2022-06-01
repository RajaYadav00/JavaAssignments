package com.masai;

public class ServiceBean {
	
	public int serviceSum(int x,int y) {
		System.out.println("Inside servise Layer");
		
		System.out.println("");
		System.out.println("==============");
		
		return (x+y);
	}
	public int serviceMultiplication(int x, int y) {
		return (x*y);
	}
	
	public int serviceSub(int x,int y) {
		return (x-y);
	}

}
