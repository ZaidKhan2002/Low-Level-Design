package com.zaid.lld.fundamentals.oops.abstraction;

public class Main {

    public static void main(String[] args) {

        Payment creditCard = new CreditCardPayment(2500);
        Payment upi = new UPIPayment(1200);
        Payment wallet = new WalletPayment(800);

        System.out.println("----- Credit Card Payment -----");
        creditCard.validate();
        creditCard.processPayment();
        creditCard.generateReceipt();

        System.out.println();

        System.out.println("----- UPI Payment -----");
        upi.validate();
        upi.processPayment();
        upi.generateReceipt();

        System.out.println();

        System.out.println("----- Wallet Payment -----");
        wallet.validate();
        wallet.processPayment();
        wallet.generateReceipt();
    }
}