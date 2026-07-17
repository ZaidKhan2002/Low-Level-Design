package com.zaid.lld.patterns.factory.good;

public class Main {

    public static void main(String[] args) {

        PaymentStrategy payment = PaymentFactory.getPaymentStrategy("UPI");
        payment.pay(1000);

        payment = PaymentFactory.getPaymentStrategy("CARD");
        payment.pay(2500);

        payment = PaymentFactory.getPaymentStrategy("WALLET");
        payment.pay(300);

    }

}
