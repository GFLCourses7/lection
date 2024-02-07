package facade.service;

import facade.model.Computer;

public class CPUService {

    public void cpuTemperatureCheck(Computer computer) {
        int temperature = computer.getTemperatureCPU();

        if (temperature < 50) {
            System.out.println("Temperature of CPU is low");
        }
        if (temperature >= 50 && temperature < 80) {
            System.out.println("Temperature of CPU is middle");
        }
        if (temperature >= 80) {
            System.out.println("Temperature of CPU is high");
        }
    }
}
