package builder.parts;

public class VideoCard {
    private String manufacturer;
    private String model;

    public VideoCard(String manufacturer, String model) {
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
