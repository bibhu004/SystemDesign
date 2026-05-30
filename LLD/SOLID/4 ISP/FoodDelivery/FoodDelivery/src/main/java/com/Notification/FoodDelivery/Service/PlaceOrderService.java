package com.Notification.FoodDelivery.Service;

import org.springframework.stereotype.Service;

import com.Notification.FoodDelivery.DTO.Order;
import com.Notification.FoodDelivery.Interface.PlaceOrder;
import com.Notification.FoodDelivery.Registry.PlaceOrderRegistry;

@Service
public class PlaceOrderService {

    private PlaceOrderRegistry placeOrderRegistry;

    public PlaceOrderService(PlaceOrderRegistry placeOrderRegistry){
        this.placeOrderRegistry = placeOrderRegistry;
    }


    public Order placeAOrder(String notificationType, Order order){
        PlaceOrder placeOrder = placeOrderRegistry.getNotificationType(notificationType);
        return placeOrder.place(order);
    }
}
