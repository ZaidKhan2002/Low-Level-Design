package com.zaid.lld.fundamentals.oops.composition;

public class OrderItem {

    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    public void displayItem() {
        System.out.println(productName +
                " | Qty: " + quantity +
                " | ₹" + getTotalPrice());
    }
}
