package com.ajit.bus_ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Ticket {
	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	private String name,email;
	private int Number_of_seats;
	private String from, to;
	private List <Passenger> passengerList = new ArrayList<Passenger>();
	private Date date;
	public static List<Ticket> ticketList = new ArrayList<Ticket>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber_of_seats() {
		return Number_of_seats;
	}
	public void setNumber_of_seats(int number_of_seats) {
		Number_of_seats = number_of_seats;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Passenger> getPassangerList() {
		return passengerList;
	}
	public void setPassangerList(Passenger passangerName) {
		passengerList.add(passangerName);
	}
	public Date getDate() {
		return date;
	}
	public void setDate(String date2) {
		try {
			Date date = format.parse(date2);
			this.date = date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
	}
	
	public void getTicketDetails()
	{
		System.out.println("===========================Ticket Details==============================");
		System.out.println("Details of the person who booked ticket");
		System.out.println("Name"+name+ "  "+"Enail "+email+" "+"Number of seats :"+Number_of_seats+" "+"Date of journey :"+date);
		System.out.println("=====================Passenger details===============================");
		for(Passenger passenger : passengerList)
		{
			System.out.println("Name : "+passenger.getName()+" "+"Age : " +passenger.getAge()+" "+"Email : "+passenger.getEmail() );
			System.out.println("------------------------------------------------------------------");
		}

	}
	

}
