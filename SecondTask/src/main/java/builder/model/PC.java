package builder.model;

import builder.parts.*;


public class PC {
    private CPU cpu;
    private MotherBoard motherBoard;
    private VideoCard videoCard;
    private Integer ram;
    private Double hdd;
    private Integer psu;


    public PC(CPU cpu, MotherBoard motherBoard, VideoCard videoCard, Integer ram, Double hdd, Integer psu){
        this.cpu=cpu;
        this.motherBoard=motherBoard;
        this.videoCard = videoCard;
        this.ram=ram;
        this.hdd=hdd;
        this.psu=psu;
    }

    public CPU getCpu() {
        return cpu;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public Integer getRam() {
        return ram;
    }

    public Double getHdd() {
        return hdd;
    }

    public Integer getPsu() {
        return psu;
    }
}
