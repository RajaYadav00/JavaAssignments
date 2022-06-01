package com.assignmentDay14.Q2;

public class Main {
	public static void main(String[] args) {
		Common c=new Common();
		ThreadRaja rj=new ThreadRaja(c,"Raja");
		ThreadRahul rh=new ThreadRahul(c,"Rahul");
		ThreadNajju n=new ThreadNajju(c,"Najmush");
		
		Thread t1=new Thread(rj);
		Thread t2=new Thread(rh);
		Thread t3=new Thread(n);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
