package com.zaid.lld.patterns.factory.bad;

public class WalletPayment implements PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
}
