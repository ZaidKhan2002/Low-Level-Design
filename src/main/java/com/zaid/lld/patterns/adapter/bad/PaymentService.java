package com.zaid.lld.patterns.adapter.bad;

public class PaymentService {

    public void processPayment(String provider, double amount) {

        if(provider.equalsIgnoreCase("STRIPE")) {

            StripeGateway stripe = new StripeGateway();
            stripe.pay(amount);

        }
        else if(provider.equalsIgnoreCase("RAZORPAY")) {

            RazorpayGateway razorpay = new RazorpayGateway();
            razorpay.makePayment(amount);

        }
        else {

            throw new IllegalArgumentException("Unsupported Payment Provider");

        }

    }

}
