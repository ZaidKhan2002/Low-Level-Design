package com.zaid.lld.fundamentals.oops.polymorphism;

public class PushNotification implements Notification {

    @Override
    public void send(String recipient, String message) {

        System.out.println("========== PUSH ==========");
        System.out.println("Recipient : " + recipient);
        System.out.println("Message   : " + message);

    }

}
