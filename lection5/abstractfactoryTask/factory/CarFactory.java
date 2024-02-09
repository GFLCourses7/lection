package factory;

import model.body.Body;
import model.engine.Engine;
import model.interior.Interior;

public interface CarFactory {
    Engine createEngine();
    Interior createInterior();
    Body createBody();
}
