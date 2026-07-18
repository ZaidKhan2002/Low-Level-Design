package com.zaid.lld.patterns.decorator.bad;

public class MilkSugarCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Coffee with Milk and Sugar";
    }

    @Override
    public double getCost() {
        return 130;
    }

}
