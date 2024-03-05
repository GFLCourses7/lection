package org.example.factory.model;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email notification");
    }
}
