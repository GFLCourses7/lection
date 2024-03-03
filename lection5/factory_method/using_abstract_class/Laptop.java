package factory_method.using_abstract_class;

public class Laptop implements Computer {
    @Override
    public void display() {
        System.out.println("Це ноутбук.");
    }
}