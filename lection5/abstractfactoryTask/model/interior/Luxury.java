package model.interior;

public class Luxury implements Interior {
    @Override
    public void turnOnNavigation() {
        System.out.println("Navigation is loading...\nDone.");
    }
}
