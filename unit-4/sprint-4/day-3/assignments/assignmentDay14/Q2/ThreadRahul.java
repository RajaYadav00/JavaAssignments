package com.assignmentDay14.Q2;

public class ThreadRahul implements Runnable{
	Common c;
	String name;
	
	public ThreadRahul(Common c,String name) {
		super();
		this.c = c;
		this.name=name;
	}
	@Override
	public void run() {
	 c.fun1(name);
		
	}

}
