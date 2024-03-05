package org.example.factory;

import org.example.factory.model.*;

public class NotificationFactory {
    public Notification createNotification(NotificationType notificationType) {
        return switch (notificationType) {
            case SMS -> new SMSNotification();
            case PUSH -> new PushNotification();
            case EMAIL -> new EmailNotification();
        };
    }
}
