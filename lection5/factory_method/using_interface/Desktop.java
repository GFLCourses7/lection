package factory_method.using_interface;

public class Desktop implements Computer {
    @Override
    public void display() {
        System.out.println("Це настільний комп'ютер.");
    }
}