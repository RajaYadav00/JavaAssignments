package com.assignmentDay14.Q3;

class Common {
	
	
	public void fun1(String name) {
		
		synchronized (Common.class) {
			
			System.out.println(Thread.currentThread().getName());
			System.out.println("Welcome :");
			
			try {
				System.out.println("get class level lock of"+name);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
