package com.online.learning.platform.event;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.online.learning.platform.dto.Notification;
import com.online.learning.platform.enums.CourseName;
import com.online.learning.platform.interfaces.Events;
import com.online.learning.platform.interfaces.NotificationChannel;

@Component
public class NewAssignment implements Events {

    List<NotificationChannel> subscribers;

    public NewAssignment(List<NotificationChannel> subscribers){
        this.subscribers = new ArrayList<>();
        this.subscribers = subscribers;
    }

    @Override
    public void subscribe(NotificationChannel notificationChannel){
        this.subscribers.add(notificationChannel);
    }

    @Override
    public void unsubscribe(NotificationChannel notificationChannel){
        this.subscribers.remove(notificationChannel);
    }

    @Override
    public void publish(CourseName courseName ){
        //yet to implement
        Notification notification = new Notification();
        notification.setSender("Live Class");
        notification.setMessage("New Assignment updated for "+ courseName);
        notification.setTimestamp(new Date());
        notification.setStatus("message in progress");

        for(NotificationChannel subscriber : subscribers){
            subscriber.publish(notification, courseName);
        }
    }

}
