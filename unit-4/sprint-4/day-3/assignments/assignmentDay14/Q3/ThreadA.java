package com.assignmentDay14.Q3;

public class ThreadA  implements Runnable{
	 Common c;

	public ThreadA(Common c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {
		 c.fun1("Raja");
		
	}
	 
	 
}
