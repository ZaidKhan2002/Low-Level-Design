package com.zaid.lld.fundamentals.solid.dip.good;

public class NotificationService {

    private final NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void notifyUser(String message) {
        notificationSender.send(message);
    }

}
