package com.food.delevery.order.tracking.registry;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.food.delevery.order.tracking.observable_Inteface.NotificationObservable;

@Component
public class NotificationRegistry {

    HashMap<String, NotificationObservable> notificationObservables;

    public NotificationRegistry(List<NotificationObservable> notificationObservables){
        this.notificationObservables = new HashMap<>();
        for(NotificationObservable notificationObservable: notificationObservables){
            this.notificationObservables.put(notificationObservable.getClass().getSimpleName(), notificationObservable);
        }
    }


    public NotificationObservable getNotificationObservable(String notificationType){
        return notificationObservables.get(notificationType);
    }

    public HashMap<String, NotificationObservable> getAllObservables(){
        return notificationObservables;
    }

}
