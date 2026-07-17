package com.zaid.lld.patterns.observer.good;

public class InvoiceObserver implements Observer {

    @Override
    public void update() {

        System.out.println("Invoice generated.");

    }

}
