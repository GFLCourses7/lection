package factory;

import model.body.Body;
import model.body.Cabrio;
import model.engine.Electrical;
import model.engine.Engine;
import model.interior.Interior;
import model.interior.Luxury;

public class ElectricalLuxuryCabrioCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new Electrical();
    }

    @Override
    public Interior createInterior() {
        return new Luxury();
    }

    @Override
    public Body createBody() {
        return new Cabrio();
    }
}
