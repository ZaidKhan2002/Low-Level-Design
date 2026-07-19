package com.zaid.lld.patterns.adapter.bad;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.processPayment("STRIPE",1000);

        paymentService.processPayment("RAZORPAY",2500);

    }

}
