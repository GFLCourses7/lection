package facade;

import facade.service.Grinder;
import facade.service.Heater;
import facade.service.WaterPump;

// Фасад для кавового автомату
public class CoffeeMachineFacade {
    private final Grinder grinder;
    private final Heater heater;
    private final WaterPump waterPump;

    public CoffeeMachineFacade() {
        this.grinder = new Grinder();
        this.heater = new Heater();
        this.waterPump = new WaterPump();
    }

    // Метод для приготування кави
    public void makeCoffee() {
        grinder.grindCoffeeBeans();
        heater.heatWater();
        waterPump.pumpWater();
        System.out.println("Your coffee is ready!");
    }
}