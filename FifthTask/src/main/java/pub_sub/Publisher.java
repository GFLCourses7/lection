package pub_sub;

public interface Publisher {

    void subscribe(String topic, Subscriber... subscribers);

    void unsubscribe(String topic, Subscriber subscriber);

    void publish();
}
