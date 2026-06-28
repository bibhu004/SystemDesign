package com.food.delevery.order.tracking.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.food.delevery.order.tracking.observable_class.EventObserver;
import com.food.delevery.order.tracking.registry.NotificationRegistry;

@Service
public class EventService {


    private NotificationRegistry notificationRegistry;
    private EventObserver eventObserver;

    public EventService(NotificationRegistry notificationRegistry, EventObserver eventObserver){
        this.notificationRegistry = notificationRegistry;
        this.eventObserver = eventObserver;
    }



    public void deleverOrder(){
        //delevery process happens
        eventObserver.notifyAllObserver();
        // HashMap<String, NotificationObservable> notificationObservables = notificationRegistry.getAllObservables();

        // for(Map.Entry<String, NotificationObservable> entry: notificationObservables.entrySet()){
        //     entry.getValue().notifys();
        // }
    }
}
