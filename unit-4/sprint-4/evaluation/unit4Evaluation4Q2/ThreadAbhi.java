package com.unit4Evaluation4Q2;

public class ThreadAbhi  implements Runnable{
	 Abhi a;
		Babi b;
		public ThreadAbhi(Abhi a, Babi b) {
			super();
			this.a = a;
			this.b = b;
		}
		@Override
		public void run() {
			a.funabhi(b);
			
		}
	
		
}
