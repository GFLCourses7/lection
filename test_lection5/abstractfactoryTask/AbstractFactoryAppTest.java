import factory.BasicGasolineSedanCarFactory;
import factory.CarFactory;
import factory.ElectricalLuxuryCabrioCarFactory;
import model.Car;
import model.body.Cabrio;
import model.body.Sedan;
import model.engine.Electrical;
import model.engine.Gasoline;
import model.interior.Basic;
import model.interior.Luxury;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class AbstractFactoryAppTest {
    @Test
    public void testSedanCarFactory() {
        CarFactory sedanFactory = new BasicGasolineSedanCarFactory();
        Car car = new Car(sedanFactory);

        assertInstanceOf(Gasoline.class, car.getEngine());
        assertInstanceOf(Sedan.class, car.getBody());
        assertInstanceOf(Basic.class, car.getInterior());

    }

    @Test
    public void testCoupeCarFactory() {
        CarFactory cabrioFactory = new ElectricalLuxuryCabrioCarFactory();
        Car car = new Car(cabrioFactory);

        assertInstanceOf(Electrical.class, car.getEngine());
        assertInstanceOf(Cabrio.class, car.getBody());
        assertInstanceOf(Luxury.class, car.getInterior());
    }
}