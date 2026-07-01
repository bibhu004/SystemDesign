package com.notification.flight.booking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.notification.flight.booking.enums.Channels;
import com.notification.flight.booking.enums.FlightName;
import com.notification.flight.booking.modle.User;

@service
public class UserService {

    private FlightService flightService;

    HashMap<String , User> users;

    public UserService(FlightService flightService){
        this.users = new HashMap<>();
        this.flightService = flightService;
    }

    public void createUser(String name){
        User user = new User();
        user.setName(name);

        users.put(name, user);
        System.out.println("User created with name - " + user.getName());
    }

    public void bookFlight(String name, FlightName flightName){
        User user = users.get(name);
        user.getBookedFlights().add(flightName);
        flightService.addPassenger(user, flightName);
        System.out.println("Booked Flights - " + user.getBookedFlights());
    }

    public void cancleFlight(String name, FlightName flightName){
        User user = users.get(name);
        user.getBookedFlights().add(flightName);
        flightService.removePassenger(user, flightName);
    }


    public void addNotificationChannel(String name, Channels channels){
        User user = users.get(name);

        user.getPrefferedChannel().add(channels);
        System.out.println("preffered channels are - " + user.getPrefferedChannel());
    }

    public void removeNotificationChannel(String name, Channels channels){
        User user = users.get(name);
        user.getPrefferedChannel().remove(channels);
    }
}
