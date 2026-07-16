package com.builder.builder.design.pattern.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.management.RuntimeErrorException;

import com.builder.builder.design.pattern.enums.OrderStatus;
import com.builder.builder.design.pattern.enums.PaymentMethod;
public class Order {

    private final String orderId;
    private final Long customerId;
    private final List<String> products;
    private final double totalAmount;
    private final String deliveryAddress;
    private final PaymentMethod paymentMethod;
    private final OrderStatus orderStatus;
    private final LocalDateTime createdAt;
    private final boolean giftWrapped;
    private final String couponCode;

    /**
     * Private Constructor
     */
    private Order(OrderBuilder builder) {
        this.orderId = builder.orderId;
        this.customerId = builder.customerId;
        this.products = List.copyOf(builder.products); // Defensive Copy
        this.totalAmount = builder.totalAmount;
        this.deliveryAddress = builder.deliveryAddress;
        this.paymentMethod = builder.paymentMethod;
        this.orderStatus = builder.orderStatus;
        this.createdAt = builder.createdAt;
        this.giftWrapped = builder.giftWrapped;
        this.couponCode = builder.couponCode;
    }

    /**
     * Entry point to Builder
     */
    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    // ---------------- Getters ----------------

    public String getOrderId() {
        return orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public List<String> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public boolean isGiftWrapped() {
        return giftWrapped;
    }

    public String getCouponCode() {
        return couponCode;
    }

    // ==========================================================
    //                  BUILDER
    // ==========================================================

    public static class OrderBuilder {

        private String orderId;
        private Long customerId;
        private List<String> products;
        private double totalAmount;
        private String deliveryAddress;
        private PaymentMethod paymentMethod;
        private OrderStatus orderStatus;
        private LocalDateTime createdAt;
        private boolean giftWrapped;
        private String couponCode;

        public OrderBuilder customerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }

        public OrderBuilder products(List<String> products) {
            this.products = products;
            return this;
        }

        public OrderBuilder totalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public OrderBuilder deliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public OrderBuilder paymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public OrderBuilder giftWrapped(boolean giftWrapped) {
            this.giftWrapped = giftWrapped;
            return this;
        }

        public OrderBuilder couponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        /**
         * Builds the Order objects
         */
        public Order build() {

            validateMandatoryFields();

            applyDefaults();

            return new Order(this);
        }

        /**
         * Validation
         */
        private void validateMandatoryFields() {

            if (customerId == null || customerId <= 0) {
                throw new IllegalArgumentException("Customer Id is mandatory.");
            }

            if (products == null || products.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }

            if (totalAmount <= 0) {
                throw new IllegalArgumentException("Total amount should be greater than zero.");
            }
        }

        /**
         * Default Values
         */
        private void applyDefaults() {

            if (orderId == null) {
                orderId = UUID.randomUUID().toString();
            }

            if (paymentMethod == null) {
                paymentMethod = PaymentMethod.COD;
            }

            if (orderStatus == null) {
                orderStatus = OrderStatus.CREATED;
            }

            if (createdAt == null) {
                createdAt = LocalDateTime.now();
            }

            // boolean defaults to false automatically
        }
    }
}