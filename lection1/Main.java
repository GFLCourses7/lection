package src;

import src.kenobi.Kenobi;

public class Main {
    public static void main(String[] args) {
        Kenobi obi = new Kenobi();
        System.out.println("General " + obi.getClass().getSimpleName() + "!");
    }
}
