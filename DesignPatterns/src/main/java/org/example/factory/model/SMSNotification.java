package org.example.factory.model;

import org.example.factory.model.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS notification");
    }
}
