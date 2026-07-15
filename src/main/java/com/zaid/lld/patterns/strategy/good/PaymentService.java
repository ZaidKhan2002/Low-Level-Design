package com.zaid.lld.patterns.strategy.good;

public class PaymentService {

    private final PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {

        paymentStrategy.pay(amount);

    }
}
