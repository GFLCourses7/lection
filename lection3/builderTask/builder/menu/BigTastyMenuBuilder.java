package builder.menu;

import builder.burger.BigTastyBuilder;
import components.Drink;
import components.Fries;

public class BigTastyMenuBuilder extends AbstractMenuBuilder {
    @Override
    public void setBurger() {
        BigTastyBuilder builder = new BigTastyBuilder();
        builder.assembleItem();

        this.burger = builder.getItem();
    }

    @Override
    public void setFries() {
        this.fries = Fries.DIPS;
    }

    @Override
    public void setDrink() {
        this.drink = Drink.JUICE;
    }

    @Override
    public void setToy() {
        this.toy = false;
    }
}
