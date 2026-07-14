package com.zaid.lld.fundamentals.solid.dip.bad;

public class NotificationService {

    private final EmailService emailService = new EmailService();

    public void notifyUser(String message) {
        emailService.send(message);
    }

}
