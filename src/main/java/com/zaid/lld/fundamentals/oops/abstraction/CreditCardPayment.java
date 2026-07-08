package com.zaid.lld.fundamentals.oops.abstraction;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card payment of ₹" + amount);
    }
}