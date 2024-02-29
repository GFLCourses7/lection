package pub_sub.subscriber;

import java.util.List;

public interface Subscriber {

    void receivedMessage(List<String> message);

}
