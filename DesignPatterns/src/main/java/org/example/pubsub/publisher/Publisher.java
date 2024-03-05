package org.example.pubsub.publisher;

import org.example.pubsub.subscribers.Subscriber;

public interface Publisher {
    void publish(String topics, String message);
    void subscribe(String topics, Subscriber... subscribers);
    void unsubscribe(String topics, Subscriber subscriber);
}
