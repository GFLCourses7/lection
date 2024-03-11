package subscribers;

import messages.Message;

public interface Subscriber {
    void receiveMessage(Message message);

    String subscriberInfo();
}
