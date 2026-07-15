package com.zaid.lld.patterns.strategy.good;

public class CardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println("Processing Card Payment of ₹" + amount);

    }
}
