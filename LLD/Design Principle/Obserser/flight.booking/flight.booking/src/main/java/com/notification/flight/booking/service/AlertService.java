package com.notification.flight.booking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.notification.flight.booking.enums.Channels;
import com.notification.flight.booking.interfaces.NotificationChannel;
import com.notification.flight.booking.modle.Notification;
import com.notification.flight.booking.modle.User;
import com.notification.flight.booking.registry.ChannelRegistry;

@Service
public class AlertService {

   
    private ChannelRegistry channelRegistry;

    public AlertService( ChannelRegistry channelRegistry){
        this.channelRegistry = channelRegistry;
    }

    public void notifyAll(List<User> users, Notification notification){
        
        for(User user : users){

            for(Channels notificationChannel : user.getPrefferedChannel()){
                NotificationChannel channel = channelRegistry.getCHannel(notificationChannel);
                channel.notifyuser(user, notification);
            }
        }
    }

}
