package com.zaid.lld.patterns.strategy.bad;

public class PaymentService {

    public void processPayment(String paymentType, double amount) {

        if (paymentType.equalsIgnoreCase("CARD")) {

            System.out.println("Processing Card Payment of ₹" + amount);

        } else if (paymentType.equalsIgnoreCase("UPI")) {

            System.out.println("Processing UPI Payment of ₹" + amount);

        } else if (paymentType.equalsIgnoreCase("WALLET")) {

            System.out.println("Processing Wallet Payment of ₹" + amount);

        } else {

            throw new IllegalArgumentException("Invalid Payment Method");

        }
    }
}
