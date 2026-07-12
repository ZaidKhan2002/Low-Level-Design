package com.zaid.lld.fundamentals.solid.ocp.bad;

public class PaymentService {

    public void processPayment(String paymentType, double amount) {

        if (paymentType.equalsIgnoreCase("CARD")) {
            System.out.println("Paid ₹" + amount + " using Card");
        }

        else if (paymentType.equalsIgnoreCase("UPI")) {
            System.out.println("Paid ₹" + amount + " using UPI");
        }

        else if (paymentType.equalsIgnoreCase("WALLET")) {
            System.out.println("Paid ₹" + amount + " using Wallet");
        }

        else {
            System.out.println("Invalid Payment Method");
        }
    }
}
