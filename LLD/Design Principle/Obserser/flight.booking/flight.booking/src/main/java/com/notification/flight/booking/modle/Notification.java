package com.notification.flight.booking.modle;

import com.notification.flight.booking.enums.FlightName;

import lombok.Data;

@Data
public class Notification {


    private FlightName FligntName;

    private String message;

}
