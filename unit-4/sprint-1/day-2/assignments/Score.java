package com.masai;

public class Score {
	
	public static void totalScore(int oncs,int twos,int threes, int fours,int six ) {
		int total=oncs+twos*2+threes*3+fours*4+six*6;
		System.out.println(total);
		
		
	}
	public static void main(String[] args) {
		
		totalScore(2,4,2,2,3);
	}
}
