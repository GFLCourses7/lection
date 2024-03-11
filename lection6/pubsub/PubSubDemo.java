import messages.Message;
import publisher.Publisher;
import publisher.PublisherImpl;
import subscribers.CanvaSubscriber;
import subscribers.MediumSubscriber;
import subscribers.Subscriber;
import subscribers.YouTubeSubscriber;
import topics.Topic;

public class PubSubDemo {
    public static void main(String[] args) {
        Publisher publisher = new PublisherImpl();

        Subscriber youTubeSubscriber = new YouTubeSubscriber();
        Subscriber mediumSubscriber = new MediumSubscriber();
        Subscriber canvaSubscriber = new CanvaSubscriber();

        Message artMessage = new Message("New art book was added to Art channel. Watch it.");

        Message ITmessage = new Message("Java 21 is available. Check it out.");
        Message newsMessage = new Message("Hot news");


        publisher.subscribe(Topic.ART, youTubeSubscriber, mediumSubscriber, canvaSubscriber);


        publisher.publish(Topic.ART, artMessage);
        publisher.publish(Topic.IT, ITmessage);
        publisher.publish(Topic.NEWS, newsMessage);

        publisher.unsubscribe(Topic.ART, canvaSubscriber);

        publisher.publish(Topic.ART, artMessage);
    }
}
