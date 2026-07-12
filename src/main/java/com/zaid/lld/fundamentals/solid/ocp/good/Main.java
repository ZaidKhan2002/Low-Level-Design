package com.zaid.lld.fundamentals.solid.ocp.good;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.processPayment(new CardPayment(), 1000);

        paymentService.processPayment(new UpiPayment(), 2000);

        paymentService.processPayment(new WalletPayment(), 3000);

    }

}
