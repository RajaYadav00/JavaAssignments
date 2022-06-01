package com.unit4Evaluation4Q2;

public class Babi {
	
	public synchronized void funbabi(Abhi a) {
		System.out.println("inside funbabi ");
		a.fun1();
	}
	public synchronized void fun2(){
		System.out.println("inside fun2 of B");
		}
}
