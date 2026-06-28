package com.notification.flight.booking.observable;

import org.springframework.stereotype.Component;

import com.notification.flight.booking.enums.FlightName;
import com.notification.flight.booking.modle.Notification;
import com.notification.flight.booking.service.AlertService;


@Component
public class AIR1201 extends BaseFlight{



    public AIR1201(AlertService alertService){
        super(alertService);
    }


    @Override
    public FlightName getFlightName(){
        return FlightName.AIR1201;
    }


    public void update(String message){
        Notification notification = new Notification();
        notification.setFligntName(getFlightName());
        notification.setMessage(message);

        alertService.notifyAll(subscribers, notification);
    }
}
