package com.zaid.lld.fundamentals.solid.ocp.bad;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.processPayment("CARD", 1000);
        paymentService.processPayment("UPI", 2000);
        paymentService.processPayment("WALLET", 3000);

    }
}
