package com.assignmentsDay5;

public class Ticket {
	private int ticketId;
	private int price;
	private static int availableTickets;
	
	public int getTicketId() {
		return ticketId;
	}

	public void setTicket(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {
		Ticket.availableTickets = availableTickets;
		}
	}
	public int calculateTicketCost(int nooftickets) {
		if(availableTickets>nooftickets) {
			availableTickets-=nooftickets;
			System.out.println("available tickets after booking are"+availableTickets);
			return (nooftickets*this.price);
		}else {
			System.out.println("ticket not avilable");
			return -1;
		}
		
	}
	

}
