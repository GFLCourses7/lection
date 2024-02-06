package org.example.facade.services;

public class GPSService implements MobileService {
    @Override
    public void start() {
        System.out.println("GPS service started");
    }

    @Override
    public void stop() {
        System.out.println("GPS service stopped");
    }
}
