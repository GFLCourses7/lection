package factory_method.using_abstract_class;

public class ComputerFactoryProducer {
    static ComputerAbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("Desktop")) {
            return new DesktopFactory();
        } else if (type.equalsIgnoreCase("Laptop")) {
            return new LaptopFactory();
        }
        return null;
    }
}