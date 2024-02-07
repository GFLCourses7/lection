package facade.service;

import facade.model.Computer;

public class HDDService {

    public void hddCheck(Computer computer) {
        long storage = computer.getStorageFullness();

        if (storage < 1000000) {
            System.out.println("Storage filled is low");
        }
        if (storage >= 1000000 && storage < 2000000) {
            System.out.println("Storage filled is middle");
        }
        if (storage >= 2000000) {
            System.out.println("Storage filled is high");
        }
    }
}
