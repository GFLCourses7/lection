package factory;

import model.body.Body;
import model.body.Sedan;
import model.engine.Engine;
import model.engine.Gasoline;
import model.interior.Basic;
import model.interior.Interior;

public class BasicGasolineSedanCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new Gasoline();
    }

    @Override
    public Interior createInterior() {
        return new Basic();
    }

    @Override
    public Body createBody() {
        return new Sedan();
    }
}
