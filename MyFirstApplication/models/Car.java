package models;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}
