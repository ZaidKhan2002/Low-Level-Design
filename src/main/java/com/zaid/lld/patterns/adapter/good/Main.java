package com.zaid.lld.patterns.adapter.good;

public class Main {

    public static void main(String[] args) {

        PaymentService stripeService = new PaymentService(new StripeGateway());
        stripeService.processPayment(1000);

        PaymentService razorpayService = new PaymentService(new RazorpayAdapter());
        razorpayService.processPayment(2500);

    }

}
