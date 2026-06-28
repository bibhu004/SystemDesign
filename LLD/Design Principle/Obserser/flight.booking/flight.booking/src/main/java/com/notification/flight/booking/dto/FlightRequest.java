package com.notification.flight.booking.dto;

import com.notification.flight.booking.enums.FlightName;

import lombok.Data;

@Data
public class FlightRequest {
    private String name;
    private FlightName flightName;
    // getter & setter
}