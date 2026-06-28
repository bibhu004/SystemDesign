package com.food.delevery.order.tracking.observable_Inteface;

import com.food.delevery.order.tracking.observer_Interface.NotificaitonOvserver;

public interface NotificationObservable {

    public void subscribe(NotificaitonOvserver observer);

    public void unsubscribe(NotificaitonOvserver observer);

    public void notifys();

}
