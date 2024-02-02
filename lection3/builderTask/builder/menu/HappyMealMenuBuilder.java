package builder.menu;

import builder.burger.CheeseBurgerBuilder;
import components.Drink;
import components.Fries;

public class HappyMealMenuBuilder extends AbstractMenuBuilder {
    @Override
    public void setBurger() {
        CheeseBurgerBuilder builder = new CheeseBurgerBuilder();
        builder.assembleItem();
        this.burger = builder.getItem();
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
        this.toy = true;
    }
}
