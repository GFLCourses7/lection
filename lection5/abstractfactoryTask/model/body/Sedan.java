package model.body;

public class Sedan implements Body {
    @Override
    public void open() {
        System.out.println("Opening the windows...\nDone.");
    }
}
