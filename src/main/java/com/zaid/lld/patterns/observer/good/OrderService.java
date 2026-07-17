package com.zaid.lld.patterns.observer.good;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {

        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update();
        }

    }

    public void placeOrder() {

        System.out.println("Order placed successfully.");

        notifyObservers();

    }

}
