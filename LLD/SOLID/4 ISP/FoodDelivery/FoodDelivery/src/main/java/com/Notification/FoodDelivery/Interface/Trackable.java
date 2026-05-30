package com.Notification.FoodDelivery.Interface;



import com.Notification.FoodDelivery.DTO.Location;
import com.Notification.FoodDelivery.DTO.Order;

public interface Trackable {

    public Location trackOrder(Order order);

}
