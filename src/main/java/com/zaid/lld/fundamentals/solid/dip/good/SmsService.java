package com.zaid.lld.fundamentals.solid.dip.good;

public class SmsService implements NotificationSender {

    @Override
    public void send(String message) {

        System.out.println("Sending SMS: " + message);

    }

}
