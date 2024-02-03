package builder.parts;

public class CPU {

    private String manufacturer;
    private Integer generation;
    private String model;

    public CPU(String manufacturer, Integer generation, String model) {
        this.manufacturer = manufacturer;
        this.generation = generation;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Integer getGeneration() {
        return generation;
    }

    public String getModel() {
        return model;
    }
}
