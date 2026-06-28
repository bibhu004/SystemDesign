package com.notification.flight.booking.observable;

import org.springframework.stereotype.Component;

import com.notification.flight.booking.enums.FlightName;
import com.notification.flight.booking.modle.Notification;
import com.notification.flight.booking.service.AlertService;


@Component
public class IND2222 extends BaseFlight{



    public IND2222(AlertService alertService){
        super(alertService);
    }


    @Override
    public FlightName getFlightName(){
        return FlightName.IND2222;
    }


    public void update(String message){
        Notification notification = new Notification();
        notification.setFligntName(getFlightName());
        notification.setMessage(message);

        alertService.notifyAll(subscribers, notification);
    }
}