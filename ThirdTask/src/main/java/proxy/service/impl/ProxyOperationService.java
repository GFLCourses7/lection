package proxy.service.impl;

import proxy.service.SecureOperationService;
import proxy.user.UserCredentials;

public class ProxyOperationService implements SecureOperationService {
    private SecureOperationService secureOperationService;
    private UserCredentials credentials;
    private String username;
    private String password;

    public ProxyOperationService(String username, String password, UserCredentials credentials) {
        this.username = username;
        this.password = password;
        this.credentials = credentials;
    }

    private boolean authorize() {
        if (credentials.getCredentials().containsKey(username)) {
            return credentials.getCredentials().get(username).equals(password);
        }
        return false;
    }

    @Override
    public void runOperation() {
        if (authorize()) {
            if (secureOperationService == null) {
                secureOperationService = new RealOperationService();
            }
            secureOperationService.runOperation();
        } else {
            System.out.println("Access denied");
        }
    }
}
