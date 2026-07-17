package com.zaid.lld.patterns.factory.good;

public class PaymentFactory {

    public static PaymentStrategy getPaymentStrategy(String paymentType) {

        switch (paymentType.toUpperCase()) {

            case "CARD":
                return new CardPayment();

            case "UPI":
                return new UpiPayment();

            case "WALLET":
                return new WalletPayment();

            default:
                throw new IllegalArgumentException("Invalid Payment Type");

        }

    }

}
