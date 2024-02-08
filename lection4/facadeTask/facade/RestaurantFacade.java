package facade;

import service.Cashier;
import service.Delivery;
import service.Kitchen;

public class RestaurantFacade {
    private final Kitchen kitchen;
    private final Cashier cashier;
    private final Delivery delivery;

    public RestaurantFacade() {
        kitchen = new Kitchen();
        cashier = new Cashier();
        delivery = new Delivery();
    }

    //для тестів
    public RestaurantFacade(Kitchen kitchen, Cashier cashier, Delivery delivery) {
        this.kitchen = kitchen;
        this.cashier = cashier;
        this.delivery = delivery;
    }

    public void orderFood() {
        System.out.println("Accepting your order...");
        kitchen.prepareFood();
        cashier.takePayment();
        delivery.deliverOrder();
        System.out.println("Your order is delivered!");
    }
}
