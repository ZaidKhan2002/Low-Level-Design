package com.zaid.lld.patterns.decorator.bad;

public class SugarCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Coffee with Sugar";
    }

    @Override
    public double getCost() {
        return 110;
    }

}
