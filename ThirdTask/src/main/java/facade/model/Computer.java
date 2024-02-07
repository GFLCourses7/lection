package facade.model;

public class Computer {

    private final String model;
    private final int temperatureCPU;
    private final int usedRAM;
    private final long storageFullness;

    public Computer(String model, int temperatureCPU, int usedRAM, long storageFullness) {
        this.model = model;
        this.temperatureCPU = temperatureCPU;
        this.usedRAM = usedRAM;
        this.storageFullness = storageFullness;
    }

    public String getModel() {
        return model;
    }

    public int getTemperatureCPU() {
        return temperatureCPU;
    }

    public int getUsedRAM() {
        return usedRAM;
    }

    public long getStorageFullness() {
        return storageFullness;
    }
}
