package pub_sub.subscriber.impl;

import pub_sub.subscriber.Subscriber;

import java.util.List;

public class SubscriberDev implements Subscriber {
    @Override
    public void receivedMessage(List<String> messages) {
        messages.forEach(message -> {
            String formattedMessage = "Message: " + message + ", from " + getClass().getSimpleName();
            System.out.println(formattedMessage);
        });
    }
}
