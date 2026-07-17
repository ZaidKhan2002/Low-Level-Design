package com.zaid.lld.patterns.factory.good;

public class CardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card.");
    }

}
