package busReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {

	String passengerName;
	int busNo;
	Date date;

	Booking() {
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter the name of passenger:    ");
		passengerName = sd.next();
		System.out.println("Enter bus no:   ");
		busNo = sd.nextInt();
		System.out.println("Enter the Date dd-mm-yyyy");
		String dateInput = sd.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> Buses) {
		int capacity = 0;
		for (Bus bus : Buses) {
			if (bus.getBusNo() == busNo)
				capacity = bus.getcapacity();
		}
		int booked = 0;
		for (Booking b : bookings) {
			if (b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked < capacity ? true : false;
	}
}
