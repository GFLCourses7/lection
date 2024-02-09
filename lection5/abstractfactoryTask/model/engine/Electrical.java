package model.engine;

public class Electrical implements Engine {
    @Override
    public void start() {
        System.out.println("Checking battery level...\nStarting engine...\nDone.");
    }
}
