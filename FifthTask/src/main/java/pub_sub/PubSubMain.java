package pub_sub;

import java.util.List;
import java.util.Map;

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

