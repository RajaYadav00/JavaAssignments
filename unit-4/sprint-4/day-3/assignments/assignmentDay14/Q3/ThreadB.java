package com.assignmentDay14.Q3;

public class ThreadB implements Runnable{
	Common c;

	public ThreadB(Common c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {
		c.fun1("Rahul");
		
	}
	

}
