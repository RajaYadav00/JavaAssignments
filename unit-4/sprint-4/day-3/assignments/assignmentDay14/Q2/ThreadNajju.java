package com.assignmentDay14.Q2;

public class ThreadNajju implements Runnable{
	Common c;
	String name;
	
	public ThreadNajju(Common c ,String name) {
		super();
		this.c = c;
		this.name=name;
	}
	@Override
	public void run() {
		c.fun1(name);
		
	}

}
