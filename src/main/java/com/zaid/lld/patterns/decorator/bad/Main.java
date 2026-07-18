package com.zaid.lld.patterns.decorator.bad;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new MilkSugarCoffee();

        System.out.println(coffee.getDescription());
        System.out.println("₹" + coffee.getCost());

    }

}
