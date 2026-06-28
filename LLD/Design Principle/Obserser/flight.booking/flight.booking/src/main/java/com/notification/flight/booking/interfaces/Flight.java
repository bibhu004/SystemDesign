package com.notification.flight.booking.interfaces;

import com.notification.flight.booking.enums.FlightName;
import com.notification.flight.booking.modle.Notification;
import com.notification.flight.booking.modle.User;

public interface Flight {

    public FlightName getFlightName();

    public void subscribe(User user);
    public void unsubscribe(User user);
    public void update(String message);
    public void reset();

}
