package com.Notification.FoodDelivery.NotificationType;



import org.springframework.stereotype.Component;

import com.Notification.FoodDelivery.DTO.Location;
import com.Notification.FoodDelivery.DTO.Order;
import com.Notification.FoodDelivery.Interface.DeliverOrder;
import com.Notification.FoodDelivery.Interface.PickupOrder;
import com.Notification.FoodDelivery.Interface.PlaceOrder;
import com.Notification.FoodDelivery.Interface.Trackable;



@Component
public class PushNotification implements PlaceOrder, PickupOrder, DeliverOrder, Trackable{


    @Override
    public Order place(Order order){
        System.out.println("Order is placed");
        return order;
    }


    @Override
    public boolean pickup(Order order){
        System.out.println("Order is picked up");
        return true;
    }

    @Override
    public boolean delivered(Order order){
        System.out.println("Order is delevered!");
        return true;
    }

    @Override
    public Location trackOrder(Order order){
        System.out.println("Updated current location");
        Location location = new Location();
        return location;
    }

}