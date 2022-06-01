package com.assignmentDay8.Q1;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		Hotel h=null;
		if(amount>1000) {
			h=new TajHotel();
		}else if(amount>200&&amount<1000) {
			h= new RoadSideHotel();
		}
		return h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Demo d=new Demo();
		System.out.println("enter amount");
		int x=sc.nextInt();
		Hotel ht=d.provideFood(x);
		if(ht!=null) {
			ht.chickenBiryani();
			ht.masalaDosa();
			if(ht instanceof TajHotel) {
				TajHotel t=(TajHotel )ht;
				t.welcomeDrink();
			}
		}else {
			System.out.println("Please Enter a valid amount");
		}
	}

}
