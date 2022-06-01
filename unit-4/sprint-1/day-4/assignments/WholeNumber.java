package com.assignmentsDay4;

public class WholeNumber {
	
	public void findNumber(int x) {
		if(x<0) {
			System.out.println("error");
		}
		else	if(x%2==1) {
			System.out.println(x);
		}else {
			int y=0;
			for(int i=1;i<9;i++) {
				if((x+i)%10==0) {
				   y=x+i;
					break;
				}
			}
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WholeNumber num=new WholeNumber();
		num.findNumber(42);
	}

}
