package com.zaid.lld.patterns.strategy.good;

public class Main {

    public static void main(String[] args) {

        PaymentStrategy upi = new UpiPayment();

        PaymentService paymentService = new PaymentService(upi);

        paymentService.processPayment(500);

        System.out.println();

        paymentService = new PaymentService(new CardPayment());

        paymentService.processPayment(1200);

        System.out.println();

        paymentService = new PaymentService(new WalletPayment());

        paymentService.processPayment(300);

    }
}
