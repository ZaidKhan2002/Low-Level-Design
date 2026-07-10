package com.zaid.lld.fundamentals.oops.composition;

public class Customer {

    private int customerId;
    private String name;
    private String email;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public void displayCustomer() {
        System.out.println("Customer : " + name);
        System.out.println("Email    : " + email);
    }
}