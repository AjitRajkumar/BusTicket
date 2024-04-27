package com.ajit.bus_ticket;

import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 * @author Ajit Rajkumar
 *
 */
public class App {
	static Scanner sc = new Scanner(System.in);
	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

	public static void main(String[] args) throws Exception {
		App app = new App();
		System.out.println(
				"==============================Welcome to bus ticket booking application ========================");
		int choice = 0;

		while (true) {

			System.out.println("1.Book TIckets 2.Display Ticket 99.exit");
			System.out.println("Enter your choice:    ");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {

				e.printStackTrace();
			}
			switch (choice) {
				case 1:
					System.out.println("Enter the details");
					app.bookTicket();
					break;
				case 2:
					System.out.println("Displaying the ticket details");
					app.displayTicket();
					break;
				case 99:
					System.out.println("Thankyou");
					System.exit(0);
			}
		}

	}

	void bookTicket() throws Exception {
		System.out.println("Enter the number of passengers: ");
		int passenger_count = sc.nextInt();
		if (TicketAvailability.checkAvailability(passenger_count)) {
			Ticket t1 = new Ticket();
			System.out.println("Please provide applicant details");
			System.out.println("Enter the name: ");
			t1.setName(sc.next());
			System.out.println("Enter the email: ");
			t1.setEmail(sc.next());
			System.out.println("Enter the source: ");
			t1.setFrom(sc.next());
			System.out.println("Enter the destination: ");
			t1.setTo(sc.next());
			System.out.println("Enter the date in the format dd-MM-yyyy: ");
			String datestr = sc.next();
			t1.setDate(datestr);
			t1.setNumber_of_seats(passenger_count);
			for (int i = 1; i <= passenger_count; i++) {
				Passenger p = new Passenger();
				System.out.println("Enter the detaisl of the passenger" + i + ":");
				System.out.println("Enter the name of the passenger: ");
				p.setName(sc.next());
				System.out.println("Enter the email of the passenger: ");
				p.setEmail(sc.next());
				System.out.println("Enter the age of the passenger: ");
				p.setAge(sc.nextInt());
				t1.setPassangerList(p);
			}
			Ticket.ticketList.add(t1);
		} else {
			System.out.println("Seats are already booked");
		}
	}

	void displayTicket() {
		for (Ticket list : Ticket.ticketList) {
			list.getTicketDetails();
		}
	}

}
