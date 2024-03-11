import messages.Message;
import org.junit.jupiter.api.Test;
import publisher.PublisherImpl;
import subscribers.CanvaSubscriber;
import subscribers.Subscriber;
import subscribers.YouTubeSubscriber;
import topics.Topic;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublisherImplTest {

    @Test
    public void testSubscribeAndPublish() {
        PublisherImpl publisher = new PublisherImpl();
        Subscriber subscriber1 = new CanvaSubscriber();
        Subscriber subscriber2 = new YouTubeSubscriber();

        publisher.subscribe(Topic.NEWS, subscriber1, subscriber2);
        publisher.subscribe(Topic.IT, subscriber2);

        Message message1 = new Message("News message");
        Message message2 = new Message("IT message");

        publisher.publish(Topic.NEWS, message1);
        publisher.publish(Topic.IT, message2);

        assertEquals(1, subscriber1.getReceivedMessages().size());
        assertEquals(2, subscriber2.getReceivedMessages().size());
        assertEquals(message1, subscriber1.getReceivedMessages().get(0));
        assertEquals(message1, subscriber2.getReceivedMessages().get(0));
        assertEquals(message2, subscriber2.getReceivedMessages().get(1));
    }

    @Test
    public void testUnsubscribe() {
        PublisherImpl publisher = new PublisherImpl();
        Subscriber subscriber1 = new YouTubeSubscriber();
        Subscriber subscriber2 = new CanvaSubscriber();

        publisher.subscribe(Topic.NEWS, subscriber1, subscriber2);
        publisher.unsubscribe(Topic.NEWS, subscriber1);

        Message message1 = new Message("News message");

        publisher.publish(Topic.NEWS, message1);

        assertEquals(0, subscriber1.getReceivedMessages().size());
        assertEquals(1, subscriber2.getReceivedMessages().size());
        assertEquals(message1, subscriber2.getReceivedMessages().get(0));
    }
}
