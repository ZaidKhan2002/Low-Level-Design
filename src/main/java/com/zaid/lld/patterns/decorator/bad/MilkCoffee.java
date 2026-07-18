package com.zaid.lld.patterns.decorator.bad;

public class MilkCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Coffee with Milk";
    }

    @Override
    public double getCost() {
        return 120;
    }

}
