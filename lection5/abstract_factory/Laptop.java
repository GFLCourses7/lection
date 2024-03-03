package abstract_factory;

public class Laptop implements Computer {
    @Override
    public void display() {
        System.out.println("Це ноутбук.");
    }
}