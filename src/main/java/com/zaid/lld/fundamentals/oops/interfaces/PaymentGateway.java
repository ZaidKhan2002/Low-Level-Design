package com.zaid.lld.fundamentals.oops.interfaces;

/**
 * Contract for all payment gateways.
 */
public interface PaymentGateway {

    void processPayment(double amount);

    default void validatePayment() {
        System.out.println("Validating payment...");
    }

    static void printGatewayInfo() {
        System.out.println("Payment Gateway Interface");
    }

    private void logInternal() {
        System.out.println("Internal logging...");
    }
}