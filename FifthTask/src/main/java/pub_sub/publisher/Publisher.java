package pub_sub.publisher;

import pub_sub.subscriber.Subscriber;

public interface Publisher {

    void subscribe(String topic, Subscriber... subscribers);

    void unsubscribe(String topic, Subscriber subscriber);

    void publish();
}
