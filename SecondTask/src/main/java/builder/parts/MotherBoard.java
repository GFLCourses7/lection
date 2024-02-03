package builder.parts;

public class MotherBoard {

    private String manufacturer;
    private String model;

    public MotherBoard(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
