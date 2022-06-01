package com.unit4Evaluation4Q2;

public class Main {
	
	public static void main(String[] args) {
		Abhi a=new Abhi();
		Babi b=new Babi();
		ThreadAbhi abhi=new ThreadAbhi(a,b);
		ThreadBabi bbi=new ThreadBabi(a,b);
		Thread t1=new Thread(abhi);
		Thread t2=new Thread(bbi);
		t1.start();
		t2.start();
		}
}


//to avoid dead lock we should not use synchronize method if not neccessory