import builder.burger.*;
import builder.item.Burger;
import builder.item.Menu;
import builder.item.Roll;
import builder.menu.BigTastyMenuBuilder;
import builder.menu.HappyMealMenuBuilder;
import builder.menu.McChickenMenuBuilder;
import builder.menu.RoyalCheeseBurgerMenuBuilder;
import builder.roll.ChickenRollBuilder;
import builder.roll.FishRollBuilder;
import director.Director;

public class App {

    public static void main(String[] args) {
        Director director = new Director();

        CheeseBurgerBuilder cheeseBurgerBuilder = new CheeseBurgerBuilder();
        director.createItem(cheeseBurgerBuilder);
        Burger cheeseBurger = cheeseBurgerBuilder.getItem();

        System.out.println(cheeseBurger);

        BigTastyBuilder bigTastyBuilder = new BigTastyBuilder();
        director.createItem(bigTastyBuilder);
        Burger bigTasty = bigTastyBuilder.getItem();

        System.out.println(bigTasty);

        HappyMealMenuBuilder happyMealBuilder = new HappyMealMenuBuilder();
        director.createItem(happyMealBuilder);
        Menu happyMeallMenu = happyMealBuilder.getItem();

        System.out.println(happyMeallMenu);

        BigTastyMenuBuilder bigTastyMealBuilder = new BigTastyMenuBuilder();
        director.createItem(bigTastyMealBuilder);
        Menu bigTastyMenu = bigTastyMealBuilder.getItem();

        System.out.println(bigTastyMenu);

        McChickenMenuBuilder mcChickenMealBuilder = new McChickenMenuBuilder();
        director.createItem(mcChickenMealBuilder);
        Menu mcChickenMenu = mcChickenMealBuilder.getItem();

        System.out.println(mcChickenMenu);

        FishRollBuilder fishRollBuilder = new FishRollBuilder();
        director.createItem(fishRollBuilder);
        Roll fishRoll = fishRollBuilder.getItem();

        System.out.println(fishRoll);

        ChickenRollBuilder chickenRollBuilder = new ChickenRollBuilder();
        director.createItem(chickenRollBuilder);
        Roll chickenRoll = chickenRollBuilder.getItem();

        System.out.println(chickenRoll);

        DoubleCheeseBurgerBuilder doubleCheeseBurgerBuilder = new DoubleCheeseBurgerBuilder();
        director.createItem(doubleCheeseBurgerBuilder);
        Burger doubleCheeseBurger = doubleCheeseBurgerBuilder.getItem();

        System.out.println(doubleCheeseBurger);

        RoyalCheeseBurgerBuilder royalCheeseBurgerBuilder = new RoyalCheeseBurgerBuilder();
        director.createItem(royalCheeseBurgerBuilder);
        Burger royalCheeseBurger = royalCheeseBurgerBuilder.getItem();

        System.out.println(royalCheeseBurger);

        DoubleRoyalCheeseBurgerBuilder doubleRoyalCheeseBurgerBuilder = new DoubleRoyalCheeseBurgerBuilder();
        director.createItem(doubleRoyalCheeseBurgerBuilder);
        Burger doubleRoyalCheeseBurger = doubleRoyalCheeseBurgerBuilder.getItem();

        System.out.println(doubleRoyalCheeseBurger);


        RoyalCheeseBurgerMenuBuilder royalCheeseBurgerMenuBuilder = new RoyalCheeseBurgerMenuBuilder();
        director.createItem(royalCheeseBurgerMenuBuilder);
        Menu royalCheeseBurgerMenu = royalCheeseBurgerMenuBuilder.getItem();
        System.out.println(royalCheeseBurgerMenu);
    }
}
