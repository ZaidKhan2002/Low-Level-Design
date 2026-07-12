package com.zaid.lld.fundamentals.solid.ocp.good;

public class PaymentService {

    public void processPayment(Payment payment, double amount) {

        payment.pay(amount);

    }

}
