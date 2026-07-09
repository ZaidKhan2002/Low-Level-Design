package com.zaid.lld.fundamentals.oops.interfaces;

public class CreditCardPayment implements PaymentGateway, Refundable, Auditable {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " to Credit Card");
    }

}
