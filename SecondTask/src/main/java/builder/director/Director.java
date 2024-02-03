package builder.director;

import builder.builders.Builder;
import builder.parts.CPU;
import builder.parts.MotherBoard;
import builder.parts.VideoCard;

public class Director {

    public void buildOfficePC(Builder builder){
        builder.setCPU(new CPU("AMD", 3, "Ryzen-3-3200"));
        builder.setMotherboard(new MotherBoard("ASUS","A-280"));
        builder.setVideoCard(new VideoCard("APOX","GeForce GT 1040"));
        builder.setRAM(8);
        builder.setHDD(0.5);
        builder.setPSU(400);
    }

    public void buildDeveloperPC(Builder builder){
        builder.setCPU(new CPU("AMD", 3, "Ryzen-5-4500"));
        builder.setMotherboard(new MotherBoard("ASUS","B-350"));
        builder.setVideoCard(new VideoCard("Palit", "GeForce GTX2060"));
        builder.setRAM(16);
        builder.setHDD(1.0);
        builder.setPSU(600);
    }

    public void buildGamerPC(Builder builder){
        builder.setCPU(new CPU("Intel", 14, "i9-14900"));
        builder.setMotherboard(new MotherBoard("MSI","Z-550"));
        builder.setVideoCard(new VideoCard("MSI", "GeForce GTX4090"));
        builder.setRAM(32);
        builder.setHDD(2.0);
        builder.setPSU(800);
    }
}
