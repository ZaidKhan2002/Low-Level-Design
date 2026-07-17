package com.zaid.lld.patterns.observer.good;

public class EmailObserver implements Observer {

    @Override
    public void update() {

        System.out.println("Email sent to customer.");

    }

}
