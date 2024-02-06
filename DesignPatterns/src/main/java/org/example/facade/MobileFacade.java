package org.example.facade;

import org.example.facade.entities.Battery;
import org.example.facade.entities.CPU;
import org.example.facade.entities.Mobile;
import org.example.facade.services.GPSService;
import org.example.facade.services.MobileService;
import org.example.facade.services.WiFiService;

import java.util.List;

public class MobileFacade {
    public Mobile on() {
        Battery battery = new Battery();
        battery.on();

        CPU cpu = new CPU();
        cpu.bootLoad();

        MobileService gpsService = new GPSService();
        gpsService.start();

        MobileService wifiService = new WiFiService();
        wifiService.start();

        List<MobileService> serviceList = List.of(gpsService, wifiService);

        return new Mobile(battery, cpu, serviceList);
    }

    public void off(Mobile mobile) {
        mobile.getServiceList().forEach(MobileService::stop);

        mobile.getCpu().shutDown();

        mobile.getBattery().off();
    }
}
