package proxy.service.impl;

import proxy.service.SecureOperationService;

public class RealOperationService implements SecureOperationService {
    @Override
    public void runOperation() {
        System.out.println("Operation is running...");
    }
}
