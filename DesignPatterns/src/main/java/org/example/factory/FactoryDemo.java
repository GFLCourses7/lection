package org.example.factory;

import org.example.factory.model.Notification;
import org.example.factory.model.NotificationType;

public class FactoryDemo {

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification(NotificationType.SMS);
        Notification notification1 = factory.createNotification(NotificationType.EMAIL);
        notification1.notifyUser();
        notification.notifyUser();
    }
}
