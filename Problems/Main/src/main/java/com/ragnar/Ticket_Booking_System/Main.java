package com.ragnar.Ticket_Booking_System;

import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Object> buses = new HashMap<>();

        Map<String, Object> bus1 = new HashMap<>();
        bus1.put("bus_number", "1");
        bus1.put("ac", "YES");
        bus1.put("capacity", 2);

        Map<String, Object> bus2 = new HashMap<>();
        bus2.put("bus_number", "3");
        bus2.put("ac", "YES");
        bus2.put("capacity", 20);

        Map<String, Object> bus3 = new HashMap<>();
        bus3.put("bus_number", "3");
        bus3.put("ac", "YES");
        bus3.put("capacity", 25);

        buses.put(1, bus1);
        buses.put(2, bus2);
        buses.put(3, bus3);

        Scanner sc = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem(buses);

        while (true) {
            try {
                System.out.println("\n1: Start Booking process\n2: Exit");
                System.out.print("Choice: ");
                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) {
                    for (Map.Entry<Integer, Object> entry : buses.entrySet()) {
                        Integer busId = entry.getKey();
                        Map<String, Object> bus = (Map<String, Object>) entry.getValue();
                        System.out.println("Bus ID: " + busId);
                        System.out.println("Bus Number: " + bus.get("bus_number"));
                        System.out.println("AC: " + bus.get("ac"));
                        System.out.println("Capacity: " + bus.get("capacity"));
                        System.out.println("------------------------");
                    }

                    System.out.print("Select a Bus ID: ");
                    int busId = Integer.parseInt(sc.nextLine());
                    System.out.print("Select the number of seats you want to book: ");
                    int seatNumber = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter a date (DD-MM-YYYY): ");
                    String date = sc.nextLine();

                    HashMap<String, Object> bookingDetail = bookingSystem.performBooking(busId, seatNumber, name, date);
                    if (bookingDetail.containsKey("error")) {
                        System.out.println("Error: " + bookingDetail.get("error"));
                    } else {
                        System.out.println("\n***************************************************************");
                        System.out.println("Booking successful...");
                        System.out.println("Bus ID: " + bookingDetail.get("bus_id"));
                        System.out.println("Passenger Name: " + bookingDetail.get("passenger_name"));
                        System.out.println("Booking ID: " + bookingDetail.get("booking_id"));
                        System.out.println("Date: " + bookingDetail.get("date"));
                        System.out.println("***************************************************************");
                    }

                } else if (choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid Choice.\n");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        sc.close();
    }
}
