package com.food.delevery.order.tracking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delevery.order.tracking.service.CustomerService;
import com.food.delevery.order.tracking.service.NotificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class CustomerController {

    private CustomerService customerService;
    private NotificationService notificationService;

    public CustomerController(CustomerService customerService, NotificationService notificationService){
        this.customerService = customerService;
        this.notificationService = notificationService;
    }


    @PostMapping("/customer/add")
    public String postMethodName(@RequestParam String name) {
        //TODO: process POST request
        customerService.createCustomer(name);
        return name;
    }


    @GetMapping("/customer/subscribe")
    public String subscribeCustomer(@RequestParam String name,
                                    @RequestParam String notificationType) {
        notificationService.subscribe(name, notificationType);
        return "Subscribed " + name;
    }

    @GetMapping("/customer/unsubscribe")
    public String unsubscribeCustomer(@RequestParam String name,
                                    @RequestParam String notificationType) {
        notificationService.unSubscribe(name, notificationType);
        return "Subscribed " + name;
    }
    
    
}
