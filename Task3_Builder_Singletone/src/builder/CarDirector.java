package builder;

public class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructSportsCar() {
        return builder.setBrand("Ferrari")
                .setModel("488 GTB")
                .setColor("Red")
                .setYear(2022)
                .setPrice(250000)
                .build();
    }

    public Car constructFamilyCar() {
        return builder.setBrand("Toyota")
                .setModel("Camry")
                .setColor("White")
                .setYear(2023)
                .setPrice(35000)
                .build();
    }
}
