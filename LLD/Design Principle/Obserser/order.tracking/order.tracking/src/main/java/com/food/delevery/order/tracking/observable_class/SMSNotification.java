package com.food.delevery.order.tracking.observable_class;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.food.delevery.order.tracking.observable_Inteface.NotificationObservable;
import com.food.delevery.order.tracking.observer_Interface.NotificaitonOvserver;

@Component
public class SMSNotification implements NotificationObservable{

    List<NotificaitonOvserver> observerList;

    public SMSNotification(){
        observerList = new ArrayList<>();

    }

    @Override
    public void subscribe(NotificaitonOvserver observer){
        this.observerList.add(observer);
    }

    @Override
    public void unsubscribe(NotificaitonOvserver observer){
        this.observerList.remove(observer);
    }

    @Override
    public void notifys(){
        for(NotificaitonOvserver observer: observerList){
            observer.update("SMS sent to customer");
        }
    }
}
