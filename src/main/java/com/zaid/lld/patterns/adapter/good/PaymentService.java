package com.zaid.lld.patterns.adapter.good;

public class PaymentService {

    private final PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {

        this.paymentGateway = paymentGateway;

    }

    public void processPayment(double amount) {

        paymentGateway.pay(amount);

    }

}
