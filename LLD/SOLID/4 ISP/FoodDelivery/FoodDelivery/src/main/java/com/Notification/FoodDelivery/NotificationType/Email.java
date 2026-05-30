package com.Notification.FoodDelivery.NotificationType;

import org.springframework.stereotype.Component;

import com.Notification.FoodDelivery.DTO.Order;
import com.Notification.FoodDelivery.Interface.DeliverOrder;
import com.Notification.FoodDelivery.Interface.PickupOrder;
import com.Notification.FoodDelivery.Interface.PlaceOrder;

@Component
public class Email implements PlaceOrder, PickupOrder, DeliverOrder{


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

}
