package com.notification.flight.booking.observer;

import org.springframework.stereotype.Component;

import com.notification.flight.booking.enums.Channels;
import com.notification.flight.booking.interfaces.NotificationChannel;
import com.notification.flight.booking.modle.Notification;
import com.notification.flight.booking.modle.User;

@Component
public class Email implements NotificationChannel{

    @Override
    public Channels getChannelName(){
        return Channels.EMAIL;
    }

    @Override
    public void notifyuser(User user, Notification notification){
        System.out.println("Email notificaiotn sent to user - " + user.getName());
    }
}
