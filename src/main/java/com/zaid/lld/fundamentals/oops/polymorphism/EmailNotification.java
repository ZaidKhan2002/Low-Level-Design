package com.zaid.lld.fundamentals.oops.polymorphism;

public class EmailNotification implements Notification {

    @Override
    public void send(String recipient, String message) {

        System.out.println("========== EMAIL ==========");
        System.out.println("Recipient : " + recipient);
        System.out.println("Message   : " + message);

    }
}
