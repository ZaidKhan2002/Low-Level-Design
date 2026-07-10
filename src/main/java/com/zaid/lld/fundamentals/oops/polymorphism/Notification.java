package com.zaid.lld.fundamentals.oops.polymorphism;

/**
 * Contract for all notification channels.
 */
public interface Notification {

    void send(String recipient, String message);

}
