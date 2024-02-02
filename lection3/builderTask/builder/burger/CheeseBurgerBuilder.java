package builder.burger;

import components.*;

public class CheeseBurgerBuilder extends AbstractBurgerBuilder {
    @Override
    public void setBunType() {
        this.bunType = BunType.WHOLE_GRAIN_WHEAT;
    }

    @Override
    public void setPatty() {
        this.patty = Patty.BEEF;
    }

    @Override
    public void setCheese() {
        this.cheese = Cheese.CHEDDAR;
    }

    @Override
    public void setSalad() {
        this.salad = "Iceberg Lettuce";
    }

    @Override
    public void setVegetables() {
        this.vegetables.add(Vegetables.ONION);
        this.vegetables.add(Vegetables.CUCUMBER);
    }

    @Override
    public void setSauce() {
        this.sauce.add(Sauce.KETCHUP);
        this.sauce.add(Sauce.MUSTARD);
    }

    @Override
    public void setDoubleCheese() {
        this.doubleCheese = Cheese.NONE;
    }

    @Override
    public void setExtraPatty() {
        this.extraPatty = Patty.NONE;
    }
}
