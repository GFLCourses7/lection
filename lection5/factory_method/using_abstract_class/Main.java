package factory_method.using_abstract_class;

public class Main {
    public static void main(String[] args) {
        // Отримання фабрики для створення настільного комп'ютера
        ComputerAbstractFactory desktopFactory = ComputerFactoryProducer.getFactory("Desktop");
        // Створення настільного комп'ютера
        Computer desktop = desktopFactory.createComputer();
        desktop.display();

        // Отримання фабрики для створення ноутбука
        ComputerAbstractFactory laptopFactory = ComputerFactoryProducer.getFactory("Laptop");
        // Створення ноутбука
        Computer laptop = laptopFactory.createComputer();
        laptop.display();
    }
}