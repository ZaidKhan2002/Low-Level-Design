package com.zaid.lld.fundamentals.oops.abstraction;

/**
 * Abstract class representing a generic Payment.
 * Provides common functionality while forcing subclasses
 * to implement their own payment processing logic.
 */
public abstract class Payment {

    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void validate() {
        System.out.println("Validating payment of ₹" + amount);
    }

    public void generateReceipt() {
        System.out.println("Receipt generated successfully.");
    }

    public abstract void processPayment();
}