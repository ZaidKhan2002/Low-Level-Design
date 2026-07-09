package com.zaid.lld.fundamentals.oops.interfaces;

public class Main {

    public static void main(String[] args) {

        PaymentGateway.printGatewayInfo();

        System.out.println();

        CreditCardPayment card = new CreditCardPayment();

        card.validatePayment();
        card.processPayment(5000);
        card.refund(1000);
        card.audit();

        System.out.println();

        UPIPayment upi = new UPIPayment();

        upi.validatePayment();
        upi.processPayment(2000);
        upi.refund(500);
        upi.audit();
    }

}
