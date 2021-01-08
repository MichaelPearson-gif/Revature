package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightMain {

	public static void main(String[] args) {
		List<Flight> flightList = new ArrayList<>();
		flightList.add(new Flight(1001, "Southwest Airlines", "American", 150.00, 5, true));
		flightList.add(new Flight(1011, "Delta Air Lines", "American", 164.00, 4, false));
		flightList.add(new Flight(1100, "JetBlue", "American", 200.00, 5, true));
		flightList.add(new Flight(1022, "Hawaiian Airlines", "American", 130.00, 5, false));
		flightList.add(new Flight(1000, "American Airlines", "American", 125.00, 3, true));
		flightList.add(new Flight(1200, "United Airlines", "American", 135.00, 3, true));
		flightList.add(new Flight(1034, "Alaska Airlines", "American", 140.00, 4, false));
		flightList.add(new Flight(1055, "Spirit Airlines", "American", 250.00, 2, true));
		
		System.out.println("Printing all the flights");
		printFlights(flightList);
		
		Collections.sort(flightList);
		System.out.println("\n\nPrinting all the flights in sorted order\n");
		printFlights(flightList);
		
		Collections.sort(flightList, new FlightAvailabilityComparator());
		System.out.println("\n\nPrinting all the flights sorted by availability\n");
		printFlights(flightList);
		
		Collections.sort(flightList, (Flight f1, Flight f2) -> {
			Double d1 = f1.getCost();
			Double d2 = f2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\n\nPrinting all the flights sorted by cost (low to high)\n");
		printFlights(flightList);
		
		Collections.sort(flightList, (Flight f1, Flight f2) -> {
			int x = 0;
			Float fl1 = f1.getRating();
			Float fl2 = f2.getRating();
			x = fl2.compareTo(fl1);
			if (x == 0) {
				Double d1 = f1.getCost();
				Double d2 = f2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\n\nPrinting all the flights sorted by rating (high to low) and if 2 or more flights have the same rating then by cost (low to hight)\n");
		printFlights(flightList);

	}

	public static void printFlights(List<Flight> flightList) {
		for (Flight f : flightList) {
			System.out.println(f);
		}
	}
}
