package builder.builders;

import builder.model.PC;
import builder.parts.CPU;
import builder.parts.MotherBoard;
import builder.parts.VideoCard;

public class PCBuilder implements Builder {
    private CPU cpu;
    private MotherBoard motherBoard;
    private VideoCard videoCard;
    private Integer ram;
    private Double hdd;
    private Integer psu;

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;

    }

    @Override
    public void setMotherboard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    @Override
    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public void setRAM(Integer ram) {
        this.ram = ram;
    }

    @Override
    public void setHDD(Double hdd) {
        this.hdd = hdd;
    }

    @Override
    public void setPSU(Integer psu) {
        this.psu = psu;
    }

    public PC buildPC() {
        return new PC(cpu, motherBoard, videoCard, ram, hdd, psu);
    }
}
