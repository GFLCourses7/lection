import facade.RestaurantFacade;
import org.junit.jupiter.api.Test;
import service.Cashier;
import service.Delivery;
import service.Kitchen;

import static org.mockito.Mockito.*;

class FacadeAppTest {
    @Test
    public void testOrderFood() {
        Kitchen kitchen = mock(Kitchen.class);
        Cashier cashier = mock(Cashier.class);
        Delivery delivery = mock(Delivery.class);

        RestaurantFacade facade = new RestaurantFacade(kitchen, cashier, delivery);

        facade.orderFood();

        verify(kitchen).prepareFood();
        verify(cashier).takePayment();
        verify(delivery).deliverOrder();
    }
}