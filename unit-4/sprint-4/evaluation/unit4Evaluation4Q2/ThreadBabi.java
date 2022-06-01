package com.unit4Evaluation4Q2;

public class ThreadBabi implements Runnable{
    Abhi a;
	Babi b;
	public ThreadBabi(Abhi a, Babi b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override 
	public void run() {
		b.funbabi(a);
	}
	
}
