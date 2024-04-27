package com.ajit.bus_ticket;

public class TicketAvailability {
	static int NumberOfTickets = 60 ;
	public static boolean checkAvailability(int count)
	{
		if(NumberOfTickets!=0)
		{
			NumberOfTickets-=count;
			System.out.println("Available tickets after booking : "+ NumberOfTickets);
			return true;
		}
		return false;
	}
	

}
