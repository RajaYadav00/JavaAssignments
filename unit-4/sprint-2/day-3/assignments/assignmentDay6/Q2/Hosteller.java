package com.assignmentDay6.Q2;

import java.util.Scanner;

public class Hosteller extends Student {
	String hostelName;
	int roomNumber;

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public static Hosteller getHostellerDetails() {
		
		Hosteller host=new Hosteller();
		
		Scanner scan=new Scanner(System.in);
		
//		stdent detailes
		System.out.println("Enter the details:");
		System.out.println("");
		System.out.println("");
			
		System.out.println("Student Id");
		int id=scan.nextInt();
		System.out.println("Student Name");
		String name=scan.next();
		System.out.println("Department Id");
		int DId=scan.nextInt();
		System.out.println("Gender");
		String gender=scan.next();
		System.out.println("Phone Number");
		String phone=scan.next();
		
//		student details end
          //setting student data------->
		
		host.setStudentId(id);
		host.setName(name);
		host.setDepartmentId(DId);
		host.setGender(gender);
		host.setPhone(phone);
		
		
		System.out.println("Hostel Name");
		String hName=scan.next();
		System.out.println("Room Number");
		int rNumber=scan.nextInt();
		
		System.out.println("Modify Room Number(Y/N");
		
		String x=scan.next();
		while(!x.equals("Y")&&!x.equals("y")&&!x.equals("N")&&!x.equals("n")) {
			System.out.println("enter valid option");
			x=scan.next();
		}
		if(x.equals("Y")||x.equals("y")) {
			System.out.println("enter new Number");
			rNumber=scan.nextInt();
		}
		
		System.out.println("Modify Phone Number(Y/N");
		
		String k=scan.next();
		while(!k.equals("Y")&&!k.equals("y")&&!k.equals("N")&&!k.equals("n")) {
			System.out.println("enter valid option");
			k=scan.next();
		}
		if(k.equals("Y")||k.equals("y")) {
			System.out.println("New Phone Number");
			k=scan.next();
			
		}
		
		host.setHostelName(hName);
		host.setRoomNumber(rNumber);
		host.setPhone(k);
		
		
		return host;
		
	}
	
   @Override
   public String toString() {
	    String str=this.getStudentId()+""+this.name+""+this.departmentId+""+this.gender+""+this.phone+""+this.hostelName+""+this.roomNumber;
     return str;
   }

}
