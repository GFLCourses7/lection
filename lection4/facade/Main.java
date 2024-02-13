package facade;

// Клієнтський код
public class Main {
    public static void main(String[] args) {
        // Створення фасаду кавового автомату
        CoffeeMachineFacade coffeeMachine = new CoffeeMachineFacade();

        // Приготування кави через фасад
        coffeeMachine.makeCoffee();
    }
}