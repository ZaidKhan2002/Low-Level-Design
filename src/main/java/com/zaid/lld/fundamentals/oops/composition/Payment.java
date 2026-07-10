package com.zaid.lld.fundamentals.oops.composition;

public class Payment {

    private String paymentMethod;
    private double amount;

    public Payment(String paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Payment Method : " + paymentMethod);
        System.out.println("Amount Paid    : ₹" + amount);
    }
}
