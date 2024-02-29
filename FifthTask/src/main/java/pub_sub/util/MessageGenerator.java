package pub_sub.util;

import pub_sub.topics.Topics;

import java.util.*;

public class MessageGenerator {

    public static final String[] TOPICS = {Topics.TOPIC_INFO, Topics.TOPIC_WARN, Topics.TOPIC_ERROR};
    private static final Random random = new Random();

    private MessageGenerator() {
    }

    public static Map<String, List<String>> generate() {

        Map<String, List<String>> generatedMessages = new HashMap<>();

        for (String topic : TOPICS) {
            generatedMessages.put(topic, new ArrayList<>());
        }
        for (int i = 0; i < 5; i++) {
            String randomTopic = TOPICS[random.nextInt(TOPICS.length)];
            String message = generateRandomMessage(randomTopic);
            generatedMessages.get(randomTopic).add(message);
        }

        return generatedMessages;
    }

    private static String generateRandomMessage(String randomTopic) {
        return "random message about " + randomTopic + " " + UUID.randomUUID();
    }
}
