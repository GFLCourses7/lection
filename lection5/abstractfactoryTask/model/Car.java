package model;

import factory.CarFactory;
import model.body.Body;
import model.engine.Engine;
import model.interior.Interior;

public class Car {
    private final Body body;
    private Engine engine;
    private Interior interior;

    public Car(CarFactory factory) {
        engine = factory.createEngine();
        body = factory.createBody();
        interior = factory.createInterior();
    }

    public void drive() {
        engine.start();
        interior.turnOnNavigation();
        body.open();
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public Interior getInterior() {
        return interior;
    }
}
