package com.zaid.lld.fundamentals.oops.abstraction;

public class WalletPayment extends Payment {

    public WalletPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Wallet payment of ₹" + amount);
    }
}