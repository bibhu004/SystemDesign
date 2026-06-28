package com.notification.flight.booking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notification.flight.booking.dto.ChannelRequest;
import com.notification.flight.booking.dto.FlightRequest;
import com.notification.flight.booking.enums.Channels;
import com.notification.flight.booking.enums.FlightName;
import com.notification.flight.booking.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/create")
    public String createUser(@RequestBody String name) {
        userService.createUser(name);
        
        return "Usre Created";
    }

    @PostMapping("/add/channel")
    public String addChannel(@RequestBody ChannelRequest channelRequest) {
        System.out.println("name - " + channelRequest.getName());
        userService.addNotificationChannel(channelRequest.getName(), channelRequest.getChannel());
        
        return "channel added for user";
    }

    @PostMapping("/book/flight")
    public String bookFlight(@RequestBody FlightRequest flightRequest) {
        userService.bookFlight(flightRequest.getName(), flightRequest.getFlightName());
        
        return "Flight Booked";
    }


    @PostMapping("/remove/channel")
    public String removeChannel(@RequestBody ChannelRequest channelRequest) {
        userService.removeNotificationChannel(channelRequest.getName(), channelRequest.getChannel());
        
        return "channel added for user";
    }

    @PostMapping("/cancle/flight")
    public String cancleFlight(@RequestBody FlightRequest flightRequest) {
        userService.cancleFlight(flightRequest.getName(), flightRequest.getFlightName());
        
        return "Flight Booked";
    }


    
}
