package model.engine;

public class Gasoline implements Engine {
    @Override
    public void start() {
        System.out.println("Checking fuel...\nHeating the vehicle...\nDone.");
    }
}
