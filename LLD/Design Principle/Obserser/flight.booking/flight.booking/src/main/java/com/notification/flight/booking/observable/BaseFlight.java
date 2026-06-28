package com.notification.flight.booking.observable;

import java.util.ArrayList;
import java.util.List;

import com.notification.flight.booking.interfaces.Flight;
import com.notification.flight.booking.modle.Notification;
import com.notification.flight.booking.modle.User;
import com.notification.flight.booking.service.AlertService;

public abstract class BaseFlight implements Flight {

    protected List<User> subscribers;
    protected AlertService alertService;
    
    public BaseFlight(AlertService alertService){
        this.subscribers = new ArrayList<>();
        this.alertService = alertService;
    }

    @Override
    public void subscribe(User user){
        this.subscribers.add(user);
    }

    @Override
    public void unsubscribe(User user){
        this.subscribers.remove(user);
    }

    @Override
    public void reset(){
        subscribers.clear();
    }

    // @Override
    // public void update( Notification notification){
    //     // alertService.notifyAll(subscribers, notification);
    //     pre
    // }

}
