package abstract_factory;

public class LaptopFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}