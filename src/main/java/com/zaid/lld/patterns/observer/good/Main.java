package com.zaid.lld.patterns.observer.good;

public class Main {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.addObserver(new EmailObserver());
        orderService.addObserver(new SmsObserver());
        orderService.addObserver(new InvoiceObserver());

        orderService.placeOrder();

    }

}
