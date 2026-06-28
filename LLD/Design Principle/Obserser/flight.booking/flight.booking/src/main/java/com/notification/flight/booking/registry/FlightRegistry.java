package com.notification.flight.booking.registry;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.notification.flight.booking.enums.FlightName;
import com.notification.flight.booking.interfaces.Flight;

@Component
public class FlightRegistry {

    HashMap<FlightName, Flight> flightRegistry;


    public FlightRegistry(List<Flight> flights){
        this.flightRegistry = new HashMap<>();
        for(Flight flight : flights){
            flightRegistry.put(flight.getFlightName(), flight);
        }
    }


    public Flight getFlight(FlightName flightName){
        return flightRegistry.get(flightName);
    }

}
