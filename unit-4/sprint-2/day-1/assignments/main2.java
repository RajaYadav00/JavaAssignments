package com.assignmentsDay5;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Ticket tic=new Ticket();
		System.out.println("Enter no booking");
		
		int booking=scan.nextInt();
		
		System.out.println("Enter the available ticket");
		
		
		int avilabletic=scan.nextInt();
		tic.setAvailableTickets(avilabletic);
		
		for(int i=0;i<booking;i++) {
			System.out.println("Enter ticked ID");
			int id=scan.nextInt();
			tic.setTicket(id);
			System.out.println("enter the price");
			int price=scan.nextInt();
			tic.setPrice(price);
			System.out.println("enter no of tickets");
			int nooftic=scan.nextInt();
			int totalprice=tic.calculateTicketCost(nooftic);
			System.out.println("total price "+(totalprice));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
