package com.notification.flight.booking.registry;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.notification.flight.booking.enums.Channels;
import com.notification.flight.booking.interfaces.NotificationChannel;

@Component
public class ChannelRegistry {

    HashMap<Channels, NotificationChannel> channelList;

    public ChannelRegistry(List<NotificationChannel> channels){
        this.channelList = new HashMap<>();
        for(NotificationChannel channel : channels){
            this.channelList.put(channel.getChannelName(), channel);
        }
    }


    public NotificationChannel getCHannel(Channels channel){
        return channelList.get(channel);
    }

}
