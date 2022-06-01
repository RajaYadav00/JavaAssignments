package com.masai;

public class City {
	public static void findCity(String name) {
		
		switch(name) {
		case "Mumbai":System.out.println("Financial city");
		                   break;
		case "Kolkata":System.out.println("City of Joy");
				           break;
		case "Delhi":System.out.println("Capital of country");
		                    break;
		case "Bangalore":System.out.println("Cyber City");
		                    break;
		 default :System.out.println("My be other Indian city");                  
		
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 findCity("Delhi");
	}

}
