package abstract_factory;

public class DesktopFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop();
    }
}
