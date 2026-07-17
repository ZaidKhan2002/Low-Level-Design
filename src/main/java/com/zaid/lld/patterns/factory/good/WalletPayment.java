package com.zaid.lld.patterns.factory.good;

public class WalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }

}
