package org.example.pubsub;

import org.example.pubsub.publisher.Publisher;
import org.example.pubsub.publisher.PublisherImpl;
import org.example.pubsub.subscribers.Subscriber;
import org.example.pubsub.subscribers.SubscriberDev;
import org.example.pubsub.subscribers.SubscriberProd;
import org.example.pubsub.subscribers.SubscriberStage;

public class PubSubDemo {

    public static void main(String[] args) {
        Subscriber dev = new SubscriberDev();
        Subscriber prod = new SubscriberProd();
        Subscriber stage = new SubscriberStage();
        TopicsRandomizer randomizer = new TopicsRandomizer();

        Publisher publisher = new PublisherImpl();
        publisher.subscribe(Topics.TOPIC_INFO, dev, stage);
        publisher.subscribe(Topics.TOPIC_INFO, dev); //filtered
        publisher.subscribe(Topics.TOPIC_WARNING, dev, stage);
        publisher.subscribe(Topics.TOPIC_ERROR, dev, stage, prod);

        String randomTopic1 = randomizer.getRandomTopic();
        publisher.publish(randomTopic1, randomizer.getRandomTopicMessage(randomTopic1));

        String randomTopic2 = randomizer.getRandomTopic();
        publisher.publish(randomTopic2, randomizer.getRandomTopicMessage(randomTopic2));

        String randomTopic3 = randomizer.getRandomTopic();
        publisher.publish(randomTopic3, randomizer.getRandomTopicMessage(randomTopic3));

        publisher.unsubscribe(Topics.TOPIC_INFO, stage);
        publisher.unsubscribe(Topics.TOPIC_WARNING, stage);

        System.out.println("--------------");
        String randomTopic4 = randomizer.getRandomTopic();
        publisher.publish(randomTopic4, randomizer.getRandomTopicMessage(randomTopic4));
    }
}
