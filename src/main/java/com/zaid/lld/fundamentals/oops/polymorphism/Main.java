package com.zaid.lld.fundamentals.oops.polymorphism;

public class Main {

    public static void main(String[] args) {

        Notification notification;

        notification = new EmailNotification();
        notification.send(
                "zaid@gmail.com",
                "Welcome to MentorMate!"
        );

        System.out.println();

        notification = new SMSNotification();
        notification.send(
                "+91 9876543210",
                "Your OTP is 482913"
        );

        System.out.println();

        notification = new PushNotification();
        notification.send(
                "Device-001",
                "Your order has been shipped."
        );

        System.out.println();

        notification = new WhatsAppNotification();
        notification.send(
                "+91 9876543210",
                "Your payment has been received."
        );

    }

}
