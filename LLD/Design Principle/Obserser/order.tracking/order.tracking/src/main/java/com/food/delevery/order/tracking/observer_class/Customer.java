package com.food.delevery.order.tracking.observer_class;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.food.delevery.order.tracking.observable_Inteface.NotificationObservable;
import com.food.delevery.order.tracking.observer_Interface.NotificaitonOvserver;

import lombok.Data;

@Data
@Component
public class Customer implements NotificaitonOvserver{

    private String name;

    List<NotificationObservable> subscriptionList;

    public Customer(){
        subscriptionList = new ArrayList<>();
    }

    @Override
    public void update(String message){
        System.out.println(message);
    }

}
