package org.example.pubsub.publisher;

import org.example.pubsub.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.example.pubsub.Topics.*;

public class PublisherImpl implements Publisher {

    private Map<String, List<Subscriber>> topicsAndSubscribersMap;

    public PublisherImpl() {
        this.topicsAndSubscribersMap = new HashMap<>();
        topicsAndSubscribersMap.put(TOPIC_INFO, new ArrayList<>());
        topicsAndSubscribersMap.put(TOPIC_WARNING, new ArrayList<>());
        topicsAndSubscribersMap.put(TOPIC_ERROR, new ArrayList<>());
    }

    @Override
    public void publish(String topics, String message) {
        List<Subscriber> subscribers = topicsAndSubscribersMap.get(topics);
        publish(subscribers, message);
    }

    public void publish(List<Subscriber> subscribers, String message) {
        subscribers.forEach(subscriber -> subscriber.receivedMessage(message));
    }

    @Override
    public void subscribe(String topics, Subscriber... subscribers) {
        List<Subscriber> subscribersList = topicsAndSubscribersMap.get(topics);

        List<Subscriber> newSubscribers = Stream.of(subscribers)
                .filter(subscriber -> !subscribersList.contains(subscriber))
                .toList();

        subscribersList.addAll(newSubscribers);
    }

    @Override
    public void unsubscribe(String topics, Subscriber subscriber) {
        topicsAndSubscribersMap.get(topics).remove(subscriber);
    }
}
