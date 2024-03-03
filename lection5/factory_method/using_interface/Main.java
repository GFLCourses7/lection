package factory_method.using_interface;

public class Main {
    public static void main(String[] args) {
        // Створення фабрики для настільних комп'ютерів
        ComputerFactory desktopFactory = new DesktopFactory();
        // Створення настільного комп'ютера
        Computer desktop = desktopFactory.createComputer();
        desktop.display();

        // Створення фабрики для ноутбуків
        ComputerFactory laptopFactory = new LaptopFactory();
        // Створення ноутбука
        Computer laptop = laptopFactory.createComputer();
        laptop.display();
    }
}
