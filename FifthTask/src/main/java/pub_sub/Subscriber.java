package pub_sub;

import java.util.List;

public interface Subscriber {

    void receivedMessage(List<String> message);

}
