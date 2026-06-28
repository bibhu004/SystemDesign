package com.online.learning.platform.registry;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.online.learning.platform.enums.NotificationChannels;
import com.online.learning.platform.interfaces.NotificationChannel;

@Component
public class ChannelRegistry {

    HashMap<NotificationChannels, NotificationChannel> channelRegistry;

    public ChannelRegistry(List<NotificationChannel> channelRegistry){
        this.channelRegistry = new HashMap<>();
        for(NotificationChannel notificationChannel: channelRegistry){

            if(notificationChannel.getClass().getSimpleName().equals("EmailChannel")){
                this.channelRegistry.put(NotificationChannels.EmailChannel, notificationChannel);
            }
            if(notificationChannel.getClass().getSimpleName().equals("PushChannel")){
                this.channelRegistry.put(NotificationChannels.PushChannel, notificationChannel);
            }
            if(notificationChannel.getClass().getSimpleName().equals("SMSChannel")){
                this.channelRegistry.put(NotificationChannels.SMSChannel, notificationChannel);
            }
        }
    }

    public NotificationChannel getChannel(NotificationChannels notificationChannels){
        return channelRegistry.get(notificationChannels);
    }
}
