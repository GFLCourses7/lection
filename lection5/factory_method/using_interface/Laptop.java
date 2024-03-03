package factory_method.using_interface;

public class Laptop implements Computer {
    @Override
    public void display() {
        System.out.println("Це ноутбук.");
    }
}