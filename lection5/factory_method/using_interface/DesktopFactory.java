package factory_method.using_interface;

public class DesktopFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop();
    }
}
