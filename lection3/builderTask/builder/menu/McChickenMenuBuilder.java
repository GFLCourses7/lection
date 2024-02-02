package builder.menu;

import builder.burger.McChickenBuilder;
import components.Drink;
import components.Fries;

public class McChickenMenuBuilder extends AbstractMenuBuilder {
    @Override
    public void setBurger() {
        McChickenBuilder builder = new McChickenBuilder();
        builder.assembleItem();

        this.burger = builder.getItem();
    }

    @Override
    public void setFries() {
        this.fries = Fries.FRENCH;
    }

    @Override
    public void setDrink() {
        this.drink = Drink.SPRITE;
    }

    @Override
    public void setToy() {
        this.toy = false;
    }
}
