package com.zaid.lld.patterns.strategy.bad;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.processPayment("UPI", 500);

        paymentService.processPayment("CARD", 1200);

        paymentService.processPayment("WALLET", 300);

    }
}
