package com.zaid.lld.patterns.adapter.bad;

public class RazorpayGateway {

    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via Razorpay.");
    }

}
