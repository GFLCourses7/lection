package model.interior;

public class Basic implements Interior {
    @Override
    public void turnOnNavigation() {
        System.out.println("Loading navigation...\nFailed (Basic interior doesn't have navigation).");
    }
}
