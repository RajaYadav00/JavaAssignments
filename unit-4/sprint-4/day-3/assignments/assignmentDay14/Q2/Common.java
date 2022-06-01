package com.assignmentDay14.Q2;

public class Common {

	public synchronized void fun1(String name) {
		System.out.print("good wishes ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(name);
	}

}
