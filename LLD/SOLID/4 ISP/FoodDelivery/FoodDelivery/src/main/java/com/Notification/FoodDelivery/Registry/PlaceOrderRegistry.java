package com.Notification.FoodDelivery.Registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.Notification.FoodDelivery.Interface.PlaceOrder;

@Component
public class PlaceOrderRegistry {

    Map<String, PlaceOrder> placedOrders = new HashMap<>();


    public PlaceOrderRegistry(List<PlaceOrder> placedOrders){
        for(PlaceOrder placeOrder : placedOrders){
            this.placedOrders.put(placeOrder.getClass().getSimpleName(), placeOrder);
        }
    }


    public PlaceOrder getNotificationType(String type){
        return placedOrders.get(type);
    }
}
