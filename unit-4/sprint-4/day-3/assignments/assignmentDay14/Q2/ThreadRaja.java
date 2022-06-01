package com.assignmentDay14.Q2;

public class ThreadRaja implements Runnable {
	Common c;
	String name;
	
	public ThreadRaja(Common c,String name) {
		super();
		this.c = c;
		this.name=name;
	}

	@Override
	public void run() {
		c.fun1(name);
		
	}

}
