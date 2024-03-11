package subscribers;

import messages.Message;

import java.util.ArrayList;
import java.util.List;

public class MediumSubscriber implements Subscriber {
    private final List<Message> receivedMessages;

    public MediumSubscriber() {
        this.receivedMessages = new ArrayList<>();
    }

    @Override
    public void receiveMessage(Message message) {
        receivedMessages.add(message);
        System.out.println("\"" + message.text() + "\" -  was send to " + subscriberInfo());
    }

    @Override
    public String subscriberInfo() {
        return "Medium Subscriber";
    }

    @Override
    public List<Message> getReceivedMessages() {
        return receivedMessages;
    }
}
