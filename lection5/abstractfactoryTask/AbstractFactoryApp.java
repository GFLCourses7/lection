import factory.BasicGasolineSedanCarFactory;
import factory.ElectricalLuxuryCabrioCarFactory;
import model.Car;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        Car sedan = new Car(new BasicGasolineSedanCarFactory());
        Car cabrio = new Car(new ElectricalLuxuryCabrioCarFactory());

        System.out.println("Test-drive Gasoline Sedan:");
        sedan.drive();
        System.out.println("\nTest-drive Electric Cabrio:");
        cabrio.drive();
    }
}
