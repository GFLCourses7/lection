package org.example.pubsub.subscribers;


public class SubscriberDev implements Subscriber {
    @Override
    public void receivedMessage(String msg) {
        System.out.println("Message: " + msg + ", from " + this.getSubscriberInfo());
    }

    @Override
    public String getSubscriberInfo() {
        return "dev-subscriber";
    }
}
