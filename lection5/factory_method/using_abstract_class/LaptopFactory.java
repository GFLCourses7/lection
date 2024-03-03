package factory_method.using_abstract_class;

public class LaptopFactory implements ComputerAbstractFactory  {
    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}