package org.example.factory.model;

import org.example.factory.model.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Push notification");
    }
}
