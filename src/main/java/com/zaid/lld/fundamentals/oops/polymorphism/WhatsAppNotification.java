package com.zaid.lld.fundamentals.oops.polymorphism;

public class WhatsAppNotification implements Notification {

    @Override
    public void send(String recipient, String message) {

        System.out.println("======= WHATSAPP =======");
        System.out.println("Recipient : " + recipient);
        System.out.println("Message   : " + message);

    }

}