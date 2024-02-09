package factory;

import model.Acoustic;
import model.Electric;
import model.Guitar;

public class GuitarFactory {

    public static Guitar createGuitar(String type) {
        if (type.equalsIgnoreCase("acoustic")) {
            return new Acoustic();
        }
        if (type.equalsIgnoreCase("electric")) {
            return new Electric();
        }
        throw new IllegalArgumentException("Unknown guitar type: " + type);
    }
}
