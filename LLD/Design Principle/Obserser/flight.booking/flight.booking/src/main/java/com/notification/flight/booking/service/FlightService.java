package com.notification.flight.booking.service;

import org.springframework.stereotype.Service;

import com.notification.flight.booking.enums.FlightName;
import com.notification.flight.booking.interfaces.Flight;
import com.notification.flight.booking.modle.User;
import com.notification.flight.booking.registry.FlightRegistry;

@Service
public class FlightService {

    private FlightRegistry flightRegistry;

    public FlightService(FlightRegistry flightRegistry){
        this.flightRegistry = flightRegistry;
    }


    public void flightEvent(FlightName flightName, String message){
        Flight flight = flightRegistry.getFlight(flightName);
        flight.update(message);
    }

    public void journeyOver(FlightName flightName){
        Flight flight = flightRegistry.getFlight(flightName);

        flight.reset();
    }


    public void addPassenger(User user, FlightName flightName){
        Flight flight = flightRegistry.getFlight(flightName);
        flight.subscribe(user);
    }


    public void removePassenger(User user, FlightName flightName){
        Flight flight = flightRegistry.getFlight(flightName);
        flight.unsubscribe(user);
    }
}
