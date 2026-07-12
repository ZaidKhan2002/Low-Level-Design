package com.zaid.lld.fundamentals.solid.ocp.good;

public class WalletPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using Wallet");

    }

}
