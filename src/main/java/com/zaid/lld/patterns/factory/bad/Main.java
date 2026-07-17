package com.zaid.lld.patterns.factory.bad;

public class Main {
    public static void main(String[] args){
        PaymentStrategy payment1 = new CardPayment();
        payment1.pay(1000);

        PaymentStrategy payment2 = new UpiPayment();
        payment2.pay(500);

        PaymentStrategy payment3 = new WalletPayment();
        payment3.pay(200);
    }
}
