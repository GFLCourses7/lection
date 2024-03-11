package publisher;

import messages.Message;
import subscribers.Subscriber;
import topics.Topic;

import java.util.*;

public class PublisherImpl implements Publisher {
    private final Map<Topic, List<Subscriber>> topicAndSubscribersMap;

    public PublisherImpl() {
        topicAndSubscribersMap = new HashMap<>();
        topicAndSubscribersMap.put(Topic.NEWS, new ArrayList<>());
        topicAndSubscribersMap.put(Topic.IT, new ArrayList<>());
        topicAndSubscribersMap.put(Topic.ART, new ArrayList<>());
    }

    @Override
    public void subscribe(Topic topic, Subscriber... subscribers) {
        Arrays.stream(subscribers)
                .forEach(subscriber -> topicAndSubscribersMap.get(topic).add(subscriber));
    }

    @Override
    public void publish(Topic topic, Message message) {
        List<Subscriber> subscribers = topicAndSubscribersMap.get(topic);
        subscribers.forEach(subscriber -> subscriber.receiveMessage(message));
    }

    @Override
    public void unsubscribe(Topic topic, Subscriber subscriber) {
        topicAndSubscribersMap.get(topic).remove(subscriber);
        System.out.println(subscriber.subscriberInfo() + " was unsubscribed from " + topic.getValue() + " channel.");
    }
}
