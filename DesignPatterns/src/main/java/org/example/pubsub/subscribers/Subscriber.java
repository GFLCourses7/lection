package org.example.pubsub.subscribers;

public interface Subscriber {

    void receivedMessage(String msg);
    String getSubscriberInfo();
}
