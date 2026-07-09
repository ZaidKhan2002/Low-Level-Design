package com.zaid.lld.fundamentals.oops.interfaces;


public class UPIPayment implements PaymentGateway, Refundable, Auditable {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " via UPI");
    }

}