package com.unit4Evaluation2Q4;

import java.util.Scanner;

public final class Chiled extends Java {
	
	
	public Chiled(int x) {
		super(x);
	}

	
	@Override
	public void method1() {
		System.out.println("inside child class method 1");
		System.out.println("value of number  :"+this.numer);
	}
	public void method3() {
		System.out.println("inside method 3  chiled class");
	}
	public void method4() {
		System.out.println("insidemthod 4 chiled class");
	}
	
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number between 1 and 10");
		
		int x=sc.nextInt();
		if(x>0&&x<10) {
			Chiled ch=new Chiled(x);
			ch.method1();
			ch.method2();
			ch.method3();
			ch.method4();
			
		}
		else {
			System.out.println("Invalid number");
		}
		
	
	}

	
}
