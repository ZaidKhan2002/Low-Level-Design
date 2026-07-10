package com.zaid.lld.fundamentals.oops.polymorphism;

public class SMSNotification implements Notification {

    @Override
    public void send(String recipient, String message) {

        System.out.println("========== SMS ==========");
        System.out.println("Recipient : " + recipient);
        System.out.println("Message   : " + message);

    }

}
