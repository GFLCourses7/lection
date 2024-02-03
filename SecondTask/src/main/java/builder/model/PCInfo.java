package builder.model;

import builder.parts.CPU;
import builder.parts.MotherBoard;
import builder.parts.VideoCard;

public class PCInfo {

    private CPU cpu;
    private MotherBoard motherBoard;
    private VideoCard videoCard;
    private Integer ram;
    private Double hdd;
    private Integer psu;

    public PCInfo(CPU cpu, MotherBoard motherBoard, VideoCard videoCard, Integer ram, Double hdd, Integer psu) {
        this.cpu = cpu;
        this.motherBoard = motherBoard;
        this.videoCard = videoCard;
        this.ram = ram;
        this.hdd = hdd;
        this.psu = psu;
    }
    public String printInfo(){
        StringBuilder info = new StringBuilder();
        info.append("This PC consist of ");
        info.append("Processor -> ")
                .append(cpu.getManufacturer()).append(" ")
                .append(cpu.getGeneration()).append(" ")
                .append(cpu.getModel()).append("\n");
        info.append("Motherboard -> ")
                .append(motherBoard.getManufacturer()).append(" ")
                .append(motherBoard.getModel()).append("\n");
        info.append("Videocard -> ")
                .append(videoCard.getManufacturer()).append(" ")
                .append(videoCard.getModel()).append("\n");
        info.append("RAM ").append(ram).append("GB").append("\n");
        info.append("HDD ").append(hdd).append("Tb").append("\n");
        info.append("PSU ").append(psu).append("W").append("\n");
        return info.toString();
    }
}
