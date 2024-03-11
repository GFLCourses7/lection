package subscribers;

import messages.Message;

import java.util.ArrayList;
import java.util.List;

public class YouTubeSubscriber implements Subscriber {
    private final List<Message> receivedMessages;

    public YouTubeSubscriber() {

        this.receivedMessages = new ArrayList<>();
    }

    @Override
    public void receiveMessage(Message message) {
        receivedMessages.add(message);
        System.out.println("\"" + message.text() + "\" -  was send to " + subscriberInfo());
    }

    @Override
    public String subscriberInfo() {
        return "YouTube Subscriber";
    }

    @Override
    public List<Message> getReceivedMessages() {
        return receivedMessages;
    }
}
