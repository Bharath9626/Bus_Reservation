package busReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo {

	public static void main(String[] args) {

		ArrayList<Bus> Buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		Buses.add(new Bus(1, true, 3));
		Buses.add(new Bus(2, true, 5));
		Buses.add(new Bus(3, false, 2));

		int userOpt = 1;
		Scanner sc = new Scanner(System.in);

		for (Bus b : Buses) {
			b.displayBusinfo();
		}
		while (userOpt == 1) {

			System.out.println("Enter 1 to ?Book and 2 to exit");
			userOpt = sc.nextInt();
			if (userOpt == 1) {
				Booking booking = new Booking();
				if (booking.isAvailable(bookings, Buses)) {
					bookings.add(booking);
					System.out.println("Your booking is Confirmed");
				} else
					System.out.println("Sorry. Bus is full .  Try another bus or date.");
			}
		}

	}
}
