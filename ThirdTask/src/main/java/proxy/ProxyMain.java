package proxy;

import proxy.service.SecureOperationService;
import proxy.service.impl.ProxyOperationService;
import proxy.user.UserCredentials;

public class ProxyMain {
    public static void main(String[] args) {

        UserCredentials credentials = new UserCredentials();
        credentials.saveUserCredentials("username1", "password1");

        SecureOperationService operationService = new ProxyOperationService("username1", "password1", credentials);
        operationService.runOperation();

        SecureOperationService operationService2 = new ProxyOperationService("username2", "password2", credentials);
        operationService2.runOperation();

    }
}
