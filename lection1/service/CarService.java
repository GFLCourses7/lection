package service;
import models.Car;

public class CarService {
    private Car car;

    public CarService(String make, String model, int year) {
        this.car = new Car(make, model, year);
    }

    public void printCarDetails() {
        car.printDetails();
    }
}
