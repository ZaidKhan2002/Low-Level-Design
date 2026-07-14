package com.zaid.lld.fundamentals.solid.dip.good;

public class EmailService implements NotificationSender {

    @Override
    public void send(String message) {

        System.out.println("Sending Email: " + message);

    }

}
