package subscribers;

import messages.Message;

import java.util.ArrayList;
import java.util.List;

public class CanvaSubscriber implements Subscriber {
    private final List<Message> receivedMessages;

    public List<Message> getReceivedMessages() {
        return receivedMessages;
    }

    public CanvaSubscriber() {
        receivedMessages = new ArrayList<>();
    }

    @Override
    public void receiveMessage(Message message) {
        receivedMessages.add(message);
        System.out.println("\"" + message.text() + "\" -  was send to " + subscriberInfo());
    }

    @Override
    public String subscriberInfo() {
        return "Canva Subscriber";
    }
}
