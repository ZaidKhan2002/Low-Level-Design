package com.zaid.lld.fundamentals.oops.composition;

public class Address {

    private String city;
    private String state;
    private String pincode;

    public Address(String city, String state, String pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public void displayAddress() {
        System.out.println(city + ", " + state + " - " + pincode);
    }
}
