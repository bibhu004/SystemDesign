package com.builder.builder.design.pattern.paymentConfig;

import java.util.UUID;

public class PaymentGatewayConfig {

    private final String merchandId;
    private final String apiKey;
    private final String baseUrl;
    private final Integer retryCount;
    private final String currency;

    //final object declaraton for singleton
    private static PaymentGatewayConfig paymentGatewayConfig;

    //method to get the singleton object
    public static PaymentGatewayConfig getInstance() {

        if(paymentGatewayConfig == null){
            paymentGatewayConfig = new PaymentGatewayConfig(PaymentBuilder builder);
        }

        return paymentGatewayConfig;
    }

    //private constructor
    private PaymentGatewayConfig(PaymentBuilder builder){
        this.merchandId = builder.merchandId;
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.retryCount = builder.retryCount;
        this.currency = builder.currency;

    }

    //entry point for builder
    public static PaymentBuilder builder(){
        return new PaymentBuilder();
    }


    //getters
    public String getMerchandId(){
        return this.merchandId;
    }

    public String getApiKey(){
        return this.apiKey;
    }

    public String getBaseUrl(){
        return this.baseUrl;
    }

    public Integer getRetryCount(){
        return this.retryCount;
    }

    public String getCurrency(){
        return this.currency;
    }

   

//builder class
    public static class PaymentBuilder{
        private  String merchandId;
        private  String apiKey;
        private  String baseUrl;
        private  Integer retryCount;
        private  String currency;


        public PaymentBuilder merchantId(String merchandId){
            this.merchandId = merchandId;
            return this;
        }

        public PaymentBuilder apiKey(String apiKey){
            this.apiKey = apiKey;
            return this;
        }
        
        public PaymentBuilder baseUrl(String baseUrl){
            this.merchandId = merchandId;
            return this;
        }

        public PaymentBuilder retryCount(Integer retryCount){
            this.retryCount = retryCount;
            return this;
        }

        public PaymentBuilder currency(String currency){
            this.currency = currency;
            return this;
        }

        //build object
        public PaymentGatewayConfig build(){

            validateMandatoryFields();
            applyDefaults();

            return new PaymentGatewayConfig(this);

        }


        private void validateMandatoryFields(){
            if(merchandId == null){
                throw new IllegalArgumentException("Merchand id cant be null");
            }

            if(apiKey == null){
                throw new IllegalArgumentException("Api key cant be empty");
            }

            if(retryCount >=0){
                throw new IllegalArgumentException("Retry count cant be greater than 0");
            }
        } 


        private void applyDefaults(){
              if (merchandId == null) {
                merchandId = UUID.randomUUID().toString();
            }

            if(currency == null){
                currency = "INR";
            }
            if(retryCount == null){
                retryCount = 2;
            }
        }

    }

}
