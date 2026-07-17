package com.zaid.lld.patterns.observer.good;

public class SmsObserver implements Observer {

    @Override
    public void update() {

        System.out.println("SMS sent to customer.");

    }

}
