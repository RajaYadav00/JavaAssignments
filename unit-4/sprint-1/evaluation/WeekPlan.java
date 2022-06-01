package com.unit4Evaluation1;

public class WeekPlan {
	
	public static void myPlan(int day,boolean holi) {
		if(day<1||day>7) {
			System.out.println(" enter valid day cod");
		}
		else if(holi==true||day==7) {
			System.out.println("Sleep in!");
		}else {
			System.out.println("Wake up at 7:00");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayOfWeek=5;
		boolean holiday=false;
		myPlan(dayOfWeek,holiday);
	}

}
