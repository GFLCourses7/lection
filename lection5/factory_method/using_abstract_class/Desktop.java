package factory_method.using_abstract_class;

public class Desktop implements Computer {
    @Override
    public void display() {
        System.out.println("Це настільний комп'ютер.");
    }
}