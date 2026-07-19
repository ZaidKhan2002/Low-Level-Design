package com.zaid.lld.patterns.adapter.good;

public class StripeGateway implements PaymentGateway {

    @Override
    public void pay(double amount) {

        System.out.println("Payment of ₹" + amount + " processed via Stripe.");

    }

}
