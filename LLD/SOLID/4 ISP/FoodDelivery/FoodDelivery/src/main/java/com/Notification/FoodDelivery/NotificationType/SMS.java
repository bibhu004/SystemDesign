package com.Notification.FoodDelivery.NotificationType;

import org.springframework.stereotype.Component;

import com.Notification.FoodDelivery.DTO.Order;
import com.Notification.FoodDelivery.Interface.DeliverOrder;
import com.Notification.FoodDelivery.Interface.PlaceOrder;

@Component
public class SMS implements PlaceOrder, DeliverOrder{


    @Override
    public Order place(Order order){
        System.out.println("Order is placed");
        return order;
    }

    @Override
    public boolean delivered(Order order){
        System.out.println("Order is delevered!");
        return true;
    }

}
