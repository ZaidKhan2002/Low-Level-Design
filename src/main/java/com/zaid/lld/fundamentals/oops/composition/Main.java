package com.zaid.lld.fundamentals.oops.composition;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Customer customer =
                new Customer(
                        101,
                        "Zaid Khan",
                        "zaid@gmail.com"
                );

        Address address =
                new Address(
                        "Mumbai",
                        "Maharashtra",
                        "400001"
                );

        Payment payment =
                new Payment(
                        "UPI",
                        72000
                );

        OrderItem laptop =
                new OrderItem(
                        "MacBook Air M4",
                        1,
                        70000
                );

        OrderItem mouse =
                new OrderItem(
                        "Wireless Mouse",
                        1,
                        2000
                );

        Order order =
                new Order(
                        5001,
                        customer,
                        address,
                        payment,
                        List.of(laptop, mouse)
                );

        order.placeOrder();
    }
}
