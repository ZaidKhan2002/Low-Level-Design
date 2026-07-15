package com.zaid.lld.patterns.strategy.good;

public class UpiPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println("Processing UPI Payment of ₹" + amount);

    }
}
