package com.zaid.lld.patterns.strategy.good;

public class WalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println("Processing Wallet Payment of ₹" + amount);

    }
}
