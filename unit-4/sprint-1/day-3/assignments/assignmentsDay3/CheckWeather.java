package com.assignmentsDay3;

public class CheckWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSnowing=false;
		boolean isRaining=false;
		double temperature=60.0;
		
	String answer=(isSnowing||isRaining||temperature<50)? "let's stay home.":"Let's go out!";
	
	System.out.println(answer);
	}

}
