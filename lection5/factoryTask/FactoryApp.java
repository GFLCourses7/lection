import factory.GuitarFactory;
import model.Electric;
import model.Guitar;

public class FactoryApp {

    public static void main(String[] args) {
        Guitar acoustic = GuitarFactory.createGuitar("acoustic");
        Electric electric = (Electric) GuitarFactory.createGuitar("electric");

        acoustic.play();
        electric.play();

        electric.plugIn();
        electric.play();
        electric.plugOut();
    }
}
