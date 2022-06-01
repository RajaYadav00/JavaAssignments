package com.assignmentDay14.Q3;

public class ThreadC  implements Runnable{
 
	
	Common c;
	
	
	public ThreadC(Common c) {
		super();
		this.c = c;
	}


	@Override
	public void run() {
		c.fun1("Najmush");
		
	}

}
