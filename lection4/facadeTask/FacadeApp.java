import facade.RestaurantFacade;

public class FacadeApp {
    public static void main(String[] args) {
        RestaurantFacade restaurant = new RestaurantFacade();
        restaurant.orderFood();
    }
}
