package builder;

public class CarBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public CarBuilder setBrand(String brand) {
        this.car.setBrand(brand);
        return this;
    }

    public CarBuilder setModel(String model) {
        this.car.setModel(model);
        return this;
    }

    public CarBuilder setColor(String color) {
        this.car.setColor(color);
        return this;
    }

    public CarBuilder setYear(int year) {
        this.car.setYear(year);
        return this;
    }

    public CarBuilder setPrice(int price) {
        this.car.setPrice(price);
        return this;
    }

    public Car build() {
        return this.car;
    }
}

