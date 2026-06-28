package com.food.delevery.order.tracking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delevery.order.tracking.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/api")
@RestController
public class EventController {

    private EventService eventService;

    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping("/delver/order/notification")
    public String getMethodName() {
        eventService.deleverOrder();
        return "notified!";
    }
    

}
