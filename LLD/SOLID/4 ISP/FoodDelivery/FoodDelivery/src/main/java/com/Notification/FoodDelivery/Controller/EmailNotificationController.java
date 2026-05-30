package com.Notification.FoodDelivery.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Notification.FoodDelivery.DTO.Order;
import com.Notification.FoodDelivery.Service.PlaceOrderService;

@RestController
@RequestMapping("/notificaiton")
public class EmailNotificationController {

    private PlaceOrderService placeOrderService;

    public EmailNotificationController(PlaceOrderService placeOrderService){
        this.placeOrderService = placeOrderService;
    }

    @PostMapping("/{type}/placeOrder")
    public Order notifyOrderPlacement(@PathVariable String type, @RequestBody Order order){
        return placeOrderService.placeAOrder(type, order);
    }
}
