package com.zaid.lld.fundamentals.oops.composition;

import java.util.List;

public class Order {

    private int orderId;

    // Composition
    private Customer customer;
    private Address address;
    private Payment payment;
    private List<OrderItem> items;

    public Order(int orderId,
                 Customer customer,
                 Address address,
                 Payment payment,
                 List<OrderItem> items) {

        this.orderId = orderId;
        this.customer = customer;
        this.address = address;
        this.payment = payment;
        this.items = items;
    }

    public void placeOrder() {

        System.out.println("========== ORDER ==========");
        System.out.println("Order ID : " + orderId);

        System.out.println();

        customer.displayCustomer();

        System.out.println();

        System.out.println("Delivery Address");
        address.displayAddress();

        System.out.println();

        System.out.println("Items");

        double total = 0;

        for (OrderItem item : items) {
            item.displayItem();
            total += item.getTotalPrice();
        }

        System.out.println();
        System.out.println("Order Total : ₹" + total);

        System.out.println();

        payment.processPayment();

        System.out.println();
        System.out.println("Order Placed Successfully");
    }
}