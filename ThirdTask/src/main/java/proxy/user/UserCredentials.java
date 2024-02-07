package proxy.user;

import java.util.HashMap;
import java.util.Map;

public class UserCredentials {

    private Map<String, String> credentials;

    public Map<String, String> getCredentials() {
        return credentials;
    }

    public void saveUserCredentials(String username, String password) {
        credentials = new HashMap<>();
        credentials.put(username, password);
    }


}
