package com.food.delevery.order.tracking.service;

import org.springframework.stereotype.Service;

import com.food.delevery.order.tracking.observable_Inteface.NotificationObservable;
import com.food.delevery.order.tracking.observer_class.Customer;
import com.food.delevery.order.tracking.registry.NotificationRegistry;

@Service
public class NotificationService {

    private NotificationRegistry notificationRegistry;
    private CustomerService customerService;

    public NotificationService( CustomerService customerService,
        NotificationRegistry notificationRegistry){
        this.customerService = customerService;
        this.notificationRegistry = notificationRegistry;
    }

    
    public void subscribe(String customerName, String notificationType){
        Customer customer = customerService.getCustomerByName(customerName);
        NotificationObservable notificationSystem = notificationRegistry.getNotificationObservable(notificationType);

        notificationSystem.subscribe(customer);
        
    }

    public void unSubscribe(String customerName, String notificationType){
        Customer customer = customerService.getCustomerByName(customerName);
        NotificationObservable notificationSystem = notificationRegistry.getNotificationObservable(notificationType);

        notificationSystem.unsubscribe(customer);
        
    }
}
