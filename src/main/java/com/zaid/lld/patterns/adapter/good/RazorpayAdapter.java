package com.zaid.lld.patterns.adapter.good;

public class RazorpayAdapter implements PaymentGateway {

    private final RazorpayGateway razorpayGateway;

    public RazorpayAdapter() {
        this.razorpayGateway = new RazorpayGateway();
    }

    @Override
    public void pay(double amount) {

        razorpayGateway.makePayment(amount);

    }

}
