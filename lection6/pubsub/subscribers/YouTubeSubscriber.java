package subscribers;

import messages.Message;

public class YouTubeSubscriber implements Subscriber {
    @Override
    public void receiveMessage(Message message) {
        System.out.println("\"" + message.text() + "\" -  was send to " + subscriberInfo());
    }

    @Override
    public String subscriberInfo() {
        return "YouTube Subscriber";
    }
}
