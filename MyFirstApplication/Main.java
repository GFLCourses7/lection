import service.CarService;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService("Toyota", "Corolla", 2022);
        carService.printCarDetails();
    }
}
