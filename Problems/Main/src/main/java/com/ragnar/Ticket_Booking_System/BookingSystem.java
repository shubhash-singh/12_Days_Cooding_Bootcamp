package com.ragnar.Ticket_Booking_System;

import java.util.*;


@SuppressWarnings("unchecked")
public class BookingSystem {
    private final HashMap<Integer, Object> buses;
    private final Map<String, Integer> seatBookings; 

    public BookingSystem(HashMap<Integer, Object> buses) {
        this.buses = buses;
        this.seatBookings = new HashMap<>();
    }

    public HashMap<String, Object> performBooking(int busId, int seatsToBook, String name, String date) {
        HashMap<String, Object> result = new HashMap<>();

        if (!buses.containsKey(busId)) {
            result.put("error", "Invalid Bus ID");
            return result;
        }

        Map<String, Object> bus = (Map<String, Object>) buses.get(busId);
        int capacity = (int) bus.get("capacity");
        String key = busId + "_" + date;

        int bookedSeats = seatBookings.getOrDefault(key, 0);

        if (bookedSeats + seatsToBook > capacity) {
            result.put("error", "Not enough seats available on this date.");
            return result;
        }

        seatBookings.put(key, bookedSeats + seatsToBook);

        result.put("bus_id", busId);
        result.put("passenger_name", name);
        result.put("date", date);
        result.put("booking_id", UUID.randomUUID().toString());

        return result;
    }
}
