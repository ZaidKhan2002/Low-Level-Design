package com.zaid.lld.fundamentals.solid.dip.good;

public class Main {

    public static void main(String[] args) {

        NotificationSender emailService = new EmailService();

        NotificationService notificationService =
                new NotificationService(emailService);

        notificationService.notifyUser("Welcome to our application!");

        System.out.println();

        NotificationSender smsService = new SmsService();

        notificationService = new NotificationService(smsService);

        notificationService.notifyUser("Your OTP is 123456");

    }

}
