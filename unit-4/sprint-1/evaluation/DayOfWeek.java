package com.unit4Evaluation1;

public class DayOfWeek {
	
	public static void myDaysWork(int day) {
		String schedule;
		switch(day) {
		case 1: schedule="Gym in the morning.";
			   System.out.println(schedule);
		         
		        break;
		case 2: schedule="Class after work.";
			System.out.println(schedule);
                 break;   
		case 3: schedule="Meetings all day.";
			System.out.println(schedule);
                   break;
		case 4:  schedule="Work from home.";
			System.out.println(schedule);
                   break;          
		case 5:  schedule="Game night after work.";
			System.out.println(schedule);
                    break;  
		case 6: schedule="Free!";
			System.out.println( schedule);
                    break; 
		case 7:  schedule="Free!";
			System.out.println(schedule);
                     break;
         default :System.out.println( "Free!" );            
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayOfWeek=2;
		myDaysWork(dayOfWeek);

	}

}
