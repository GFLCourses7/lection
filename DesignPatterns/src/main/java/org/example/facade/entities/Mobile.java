package org.example.facade.entities;

import org.example.facade.services.MobileService;

import java.util.List;

public class Mobile {
    private final Battery battery;
    private final CPU cpu;
    private final List<MobileService> serviceList;

    public Mobile(Battery battery, CPU cpu, List<MobileService> serviceList) {
        this.battery = battery;
        this.cpu = cpu;
        this.serviceList = serviceList;
    }

    public Battery getBattery() {
        return battery;
    }

    public CPU getCpu() {
        return cpu;
    }

    public List<MobileService> getServiceList() {
        return serviceList;
    }
}
