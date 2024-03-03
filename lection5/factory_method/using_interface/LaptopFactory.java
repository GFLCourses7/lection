package factory_method.using_interface;

public class LaptopFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}