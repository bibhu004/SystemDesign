package com.food.delevery.order.tracking.observable_class;

import java.util.List;

import org.springframework.stereotype.Component;

import com.food.delevery.order.tracking.observable_Inteface.EventObservable;
import com.food.delevery.order.tracking.observable_Inteface.NotificationObservable;

@Component
public class EventObserver implements EventObservable {

    List<NotificationObservable> observables;

   
    public EventObserver(List<NotificationObservable> observables){
        this.observables = observables;
    }

    @Override
    public void notifyAllObserver(){
        for(NotificationObservable notificationObservable : observables){
            notificationObservable.notifys();
        }
    }
}