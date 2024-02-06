package org.example.facade.services;

import org.example.facade.services.MobileService;

public class WiFiService implements MobileService {
    @Override
    public void start() {
        System.out.println("WiFi service started");
    }

    @Override
    public void stop() {
        System.out.println("WiFi service stopped");
    }
}
