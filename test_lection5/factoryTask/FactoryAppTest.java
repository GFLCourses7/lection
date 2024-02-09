import factory.GuitarFactory;
import model.Acoustic;
import model.Electric;
import model.Guitar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryAppTest {
    @Test
    public void createAcousticGuitar() {
        Guitar guitar = GuitarFactory.createGuitar("acoustic");
        assertNotNull(guitar);
        assertInstanceOf(Acoustic.class, guitar);
    }

    @Test
    public void createElectricGuitar() {
        Guitar guitar = GuitarFactory.createGuitar("electric");
        assertNotNull(guitar);
        assertInstanceOf(Electric.class, guitar);
    }

    @Test
    public void createUnknownGuitar() {
        assertThrows(IllegalArgumentException.class, () -> {
            GuitarFactory.createGuitar("unknown");
        });
    }
}