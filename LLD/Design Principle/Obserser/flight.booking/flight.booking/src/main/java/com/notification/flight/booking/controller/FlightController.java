package com.notification.flight.booking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notification.flight.booking.enums.FlightName;
import com.notification.flight.booking.service.FlightService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/flight")
public class FlightController {

    private FlightService flightService;

    public FlightController(FlightService flightService){
        this.flightService = flightService;
    }


    @PostMapping("/update")
    public String update(@RequestBody String message, FlightName flightName) {
        flightService.flightEvent(flightName, message);
        
        return "message broadcasted";
    }
    

    @GetMapping("/over/{flightName}")
    public String getMethodName(@RequestParam FlightName flightName) {
        flightService.journeyOver(flightName);
        return "Flight ready for next ride!!";
    }
    
}
