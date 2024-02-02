package builder.menu;

import builder.burger.RoyalCheeseBurgerBuilder;
import components.Drink;
import components.Fries;

public class RoyalCheeseBurgerMenuBuilder extends AbstractMenuBuilder {
    @Override
    public void setBurger() {
        RoyalCheeseBurgerBuilder royalCheeseBurgerBuilder = new RoyalCheeseBurgerBuilder();
        royalCheeseBurgerBuilder.assembleItem();
        this.burger = royalCheeseBurgerBuilder.getItem();
    }

    @Override
    public void setFries() {
        this.fries = Fries.FRENCH;
    }

    @Override
    public void setDrink() {
        this.drink = Drink.COCA_COLA;
    }

    @Override
    public void setToy() {
        this.toy = false;
    }
}
