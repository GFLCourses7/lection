package publisher;

import messages.Message;
import subscribers.Subscriber;
import topics.Topic;

public interface Publisher {
    void publish(Topic topic, Message message);
    void subscribe(Topic topic, Subscriber ... subscribers);
    void unsubscribe(Topic topic, Subscriber subscriber);
}
