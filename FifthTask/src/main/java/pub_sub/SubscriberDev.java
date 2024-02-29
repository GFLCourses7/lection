package pub_sub;

import java.util.List;

public class SubscriberDev implements Subscriber {
    @Override
    public void receivedMessage(List<String> messages) {
        messages.forEach(message -> {
            String formattedMessage = "Message: " + message + ", from " + getClass().getSimpleName();
            System.out.println(formattedMessage);
        });
    }
}
