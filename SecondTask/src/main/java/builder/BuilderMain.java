package builder;

import builder.builders.PCBuilder;
import builder.builders.PCInfoBuilder;
import builder.director.Director;
import builder.model.PC;
import builder.model.PCInfo;

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();

        PCBuilder pcBuilder = new PCBuilder();
        director.buildOfficePC(pcBuilder);

        PC pc = pcBuilder.buildPC();
        System.out.println("PC base on: " +
                pc.getCpu().getManufacturer() +
                pc.getCpu().getModel() +
                pc.getVideoCard().getModel() + " build!!!");

        PCInfoBuilder pcInfoBuilder = new PCInfoBuilder();
        director.buildGamerPC(pcInfoBuilder);
        PCInfo pcInfo = pcInfoBuilder.buildPCInfo();
        System.out.println(pcInfo.printInfo());
    }
}
