package com.food.delevery.order.tracking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.food.delevery.order.tracking.observer_class.Customer;

@Service
public class CustomerService {

    private List<Customer> customers;

    public CustomerService(){
        this.customers = new ArrayList<>();
    }


    public void createCustomer(String name){
        Customer customer = new Customer();
        customer.setName(name);
        customers.add(customer);
    }

    public Customer getCustomerByName(String customerName){
        for(Customer customer : customers){
            if(customer.getName().equals(customerName))
                return customer;
        }
        throw new RuntimeException("Customer with name '" + customerName + "' not found");
    }
}
