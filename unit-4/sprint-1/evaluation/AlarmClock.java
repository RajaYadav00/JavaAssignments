package com.unit4Evaluation1;

public class AlarmClock {
	int day;
	boolean vacation;
	void myAlarms(int x,boolean vac) {
		if(x<0||x>6|| (vac!=true&&vac!=false)) {
			System.out.println("error");
			}
		else if(vac==true) {
			if(x!=0) {
				System.out.println("10:00");
			}else {
				System.out.println("off");
			}
		}else {
			if(x!=0) {
				System.out.println("7:00");
			}else {
				System.out.println("10:00");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmClock d1=new AlarmClock();
		d1.day=5;
		d1.vacation=true;
		d1.myAlarms(d1.day,d1.vacation);
		
	}

}
