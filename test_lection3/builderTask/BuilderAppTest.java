import builder.burger.CheeseBurgerBuilder;
import builder.item.Burger;
import components.*;
import director.Director;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BuilderAppTest {

    private Burger testBurger;
    private Director director;

    @BeforeEach
    void setUp() {
        testBurger = new Burger(BunType.PITA,
                Patty.BEEF,
                Cheese.CHEDDAR,
                "SALAD",
                List.of(Vegetables.ONION),
                Set.of(Sauce.KETCHUP),
                Cheese.NONE,
                Patty.NONE);

        director = new Director();
    }

    @Test
    public void testBuilder() {
        CheeseBurgerBuilder cheeseBurgerBuilder = mock(CheeseBurgerBuilder.class);

        director.createItem(cheeseBurgerBuilder);

        when(cheeseBurgerBuilder.getItem()).thenReturn(testBurger);

        Burger createdBurger = cheeseBurgerBuilder.getItem();

        assertEquals(testBurger, createdBurger);

        verify(cheeseBurgerBuilder, times(1)).getItem();
    }

    @Test
    void testDirector() {
        CheeseBurgerBuilder cheeseBurgerBuilder = mock(CheeseBurgerBuilder.class);

        director.createItem(cheeseBurgerBuilder);

        verify(cheeseBurgerBuilder, times(1)).assembleItem();
    }
}
