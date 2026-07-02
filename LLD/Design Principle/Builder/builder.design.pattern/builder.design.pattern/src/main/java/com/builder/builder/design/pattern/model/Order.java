package com.builder.builder.design.pattern.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.builder.builder.design.pattern.enums.OrderStatus;
import com.builder.builder.design.pattern.enums.PaymentMethod;

public class Order {

    private String orderId;
    private String customerId;
    private List<String> products;
    private double totalAmount;
    private String  deliveryAddress;
    private PaymentMethod paymentMethod;
    private OrderStatus orderStatus;
    private LocalDateTime createdAt;
    private boolean giftWrap;
    private String  couponCode;

    private Order(OrderBuilder builder){

    }

    public static class OrderBuilder{

        private String orderId;
        private String customerId;
        private List<String> products;
        private double totalAmount;
        private String  deliveryAddress;
        private PaymentMethod paymentMethod;
        private OrderStatus orderStatus;
        private LocalDateTime createdAt;
        private boolean giftWrap;
        private String  couponCode;


        public OrderBuilder orderId(String orderId){
            this.orderId = orderId;
            return this;
        }

        public OrderBuilder customerId(String customerId){
            this.customerId = customerId;
            return this;
        }

        public OrderBuilder products(List<String> products){
            this.products = products;
            return this;
        }

        public OrderBuilder totalAmount(double totalAmount){
            this.totalAmount = totalAmount;
            return this;
        }

        public OrderBuilder deliveryAddress(String deliveryAddress){
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public OrderBuilder paymentMethod(PaymentMethod paymentMethod){
            this.paymentMethod = paymentMethod;
            return this;
        }

        public OrderBuilder orderStatus(OrderStatus orderStatus){
            this.orderStatus = orderStatus;
            return this;
        }

        public OrderBuilder createdAt(LocalDateTime createdAt){
            this.createdAt = createdAt;
            return this;
        }

        public OrderBuilder giftWrap(boolean giftWrap){
            this.giftWrap = giftWrap;
            return this;
        }

        public OrderBuilder couponCode(String couponCode){
            this.couponCode = couponCode;
            return this;
        }

        public Order build(){
            if(customerId == null || products.size() == 0 || totalAmount == 0.0)
                throw new RuntimeException("Mandatory fields are blank");
            return new Order(this);
        }
        

    }
}
