package com.assignmentDay9.Q2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter valid username");
		
		String name = sc.nextLine();
		String regex = "[a-zA-Z]{3,8}";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(name);

		System.out.println("enter password");
		String password = sc.next();
		Pattern p2 = Pattern.compile("[a-zA-Z0-9]{3,8}");
		Matcher m2 = p2.matcher(password);

		System.out.println("enter mobile number");
		Pattern p3 = Pattern.compile("[6789]{1}[0-9]{9}");
		String mob = sc.next();
		Matcher m3 = p3.matcher(mob);
		
		System.out.println("enter e-mail address");
		
		Pattern p4=Pattern.compile("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}");
		
		String email=sc.next();
		Matcher m4=p4.matcher(email);
		System.out.println(m4.matches());
		
		if(m1.matches()&&m2.matches()&&m3.matches()&&m4.matches()) {
			c.setUsername(name);
			c.setMobileNumber(mob);
			c.setPassord(password);
			c.setEmail(email);
			System.out.println("objecte created");
		}else {
			if(!m1.matches()) {
				System.out.println("invalid user name");
			}
			if(!m2.matches()) {
				System.out.println("invalid password");
			}
			if(!m3.matches()) {
				System.out.println("invalid mobile no");
			}
			if(!m4.matches()) {
				System.out.println("invalid email address");
			}
				
		}
	}

}
