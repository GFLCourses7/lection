package pub_sub;

import pub_sub.publisher.Publisher;
import pub_sub.publisher.impl.PublisherImpl;
import pub_sub.subscriber.Subscriber;
import pub_sub.subscriber.impl.SubscriberDev;
import pub_sub.subscriber.impl.SubscriberProd;
import pub_sub.subscriber.impl.SubscriberQA;
import pub_sub.topics.Topics;

public class PubSubMain {
    public static void main(String[] args) {
        Subscriber dev = new SubscriberDev();
        Subscriber prod = new SubscriberProd();
        Subscriber qa = new SubscriberQA();

        Publisher publisher = new PublisherImpl();
        publisher.subscribe(Topics.TOPIC_INFO, dev);
        publisher.subscribe(Topics.TOPIC_WARN, dev, qa, qa);
        publisher.subscribe(Topics.TOPIC_ERROR, dev, prod, qa);

        publisher.publish();

        System.out.println("______________________________");

        publisher.unsubscribe(Topics.TOPIC_WARN, qa);

        publisher.publish();

        System.out.println("______________________________");

        publisher.subscribe(Topics.TOPIC_ERROR, qa);

        publisher.publish();

    }
}

