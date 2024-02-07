package facade.service;

import facade.model.Computer;

public class RAMService {

    public void ramCheck(Computer computer) {
        int usedMemory = computer.getUsedRAM();

        if (usedMemory < 30) {
            System.out.println("RAM load is low");
        }
        if (usedMemory >= 30 && usedMemory < 70) {
            System.out.println("RAM load is middle");
        }
        if (usedMemory >= 70) {
            System.out.println("RAM load is high");
        }
    }
}
