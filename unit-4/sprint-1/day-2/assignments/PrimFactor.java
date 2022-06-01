package com.masai;

public class PrimFactor {
	public static void factors(int x) {
		if(x<=2) {
			System.out.println("Not a valid Number");
		}
		for(int i=1;i<= x/2;i++) {
			
			if(x%i==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factors(15);

	}

}
