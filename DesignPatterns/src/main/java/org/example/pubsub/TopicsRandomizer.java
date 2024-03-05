package org.example.pubsub;

import java.util.*;

public class TopicsRandomizer {
    private Map<String, List<String>> topicsAndMessages;
    private Random random = new Random();

    public TopicsRandomizer() {
        topicsAndMessages = new HashMap<>();
        topicsAndMessages.put(Topics.TOPIC_INFO, List.of("Info message 1", "Info message 2", "Info message 3"));
        topicsAndMessages.put(Topics.TOPIC_WARNING, List.of("Warning message 1", "Warning message 2", "Warning message 3"));
        topicsAndMessages.put(Topics.TOPIC_ERROR, List.of("Error message 1", "Error message 2", "Error message 3"));
    }

    public String getRandomTopic() {
        List<String> keys = new ArrayList<>(topicsAndMessages.keySet());
        return keys.get(random.nextInt(keys.size()));
    }

    public String getRandomTopicMessage(String topic) {
        List<String> messages = topicsAndMessages.get(topic);
        return messages.get(random.nextInt(messages.size()));
    }
}
