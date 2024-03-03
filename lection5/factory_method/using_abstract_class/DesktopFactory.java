package factory_method.using_abstract_class;

public class DesktopFactory implements ComputerAbstractFactory {
    @Override
    public Computer createComputer() {
        return new Desktop();
    }
}
