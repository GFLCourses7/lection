package pub_sub.publisher.impl;

import pub_sub.publisher.Publisher;
import pub_sub.subscriber.Subscriber;
import pub_sub.topics.Topics;
import pub_sub.util.MessageGenerator;

import java.util.*;

public class PublisherImpl implements Publisher {

    private final Map<String, Set<Subscriber>> topicsAndSubs;
    private final Map<String, List<String>> generatedMessages;

    public PublisherImpl() {
        this.topicsAndSubs = new HashMap<>();
        this.generatedMessages = MessageGenerator.generate();
        topicsAndSubs.put(Topics.TOPIC_INFO, new HashSet<>());
        topicsAndSubs.put(Topics.TOPIC_WARN, new HashSet<>());
        topicsAndSubs.put(Topics.TOPIC_ERROR, new HashSet<>());
    }

    @Override
    public void subscribe(String topic, Subscriber... subscribers) {
        topicsAndSubs.get(topic).addAll(Arrays.stream(subscribers).toList());
    }

    @Override
    public void unsubscribe(String topic, Subscriber subscriber) {
        topicsAndSubs.get(topic).remove(subscriber);
    }

    @Override
    public void publish() {
        Set<Subscriber> infoSubs = topicsAndSubs.get(Topics.TOPIC_INFO);
        Set<Subscriber> warnSubs = topicsAndSubs.get(Topics.TOPIC_WARN);
        Set<Subscriber> errorSubs = topicsAndSubs.get(Topics.TOPIC_ERROR);
        for (Map.Entry<String, List<String>> entry : generatedMessages.entrySet()) {
            if (Objects.equals(entry.getKey(), Topics.TOPIC_INFO)) {
                publish(infoSubs, entry.getValue());
            }
            if (Objects.equals(entry.getKey(), Topics.TOPIC_WARN)) {
                publish(warnSubs, entry.getValue());
            }
            if (Objects.equals(entry.getKey(), Topics.TOPIC_ERROR)) {
                publish(errorSubs, entry.getValue());
            }
        }
    }

    private void publish(Set<Subscriber> subscribers, List<String> topicMessage) {
        subscribers.forEach(subscriber -> subscriber.receivedMessage(topicMessage));
    }
}
