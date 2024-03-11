package subscribers;

import messages.Message;

import java.util.List;

public interface Subscriber {
    void receiveMessage(Message message);

    String subscriberInfo();
    List<Message> getReceivedMessages();
}
