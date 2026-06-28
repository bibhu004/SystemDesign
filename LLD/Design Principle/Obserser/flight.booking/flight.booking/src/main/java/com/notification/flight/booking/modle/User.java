package com.notification.flight.booking.modle;

import java.util.List;

import com.notification.flight.booking.enums.Channels;
import com.notification.flight.booking.enums.FlightName;

import lombok.Data;

@Data
public class User {


    String name;

    List<Channels> prefferedChannel;

    List<FlightName> bookedFlights; 
}
