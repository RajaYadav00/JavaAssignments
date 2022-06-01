package com.assignmentDay14.Q3;

public class Main {

	public static void main(String[] args) {
		
		Common c=new Common();
		
		ThreadA ta=new ThreadA(c);
		ThreadB tb=new ThreadB(c);
		ThreadC tc=new ThreadC(c);
		
		Thread t1=new Thread(ta);
		Thread t2=new Thread(tb);
		Thread t3=new Thread(tc);
	   t1.setName("Raja");
	   t2.setName("Rahul");
	   t3.setName("najmush");
		t1.start();
		t2.start();
		t3.start();

	}

}
