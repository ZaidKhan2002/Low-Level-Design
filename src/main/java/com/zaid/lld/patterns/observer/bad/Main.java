package com.zaid.lld.patterns.observer.bad;

public class Main {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.placeOrder();

    }

}
