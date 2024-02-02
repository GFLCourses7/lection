package builder.burger;

import components.*;

public class RoyalCheeseBurgerBuilder extends AbstractBurgerBuilder {
    @Override
    public void setBunType() {
        this.bunType = BunType.BURGER;
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
        this.salad = "none";
    }

    @Override
    public void setVegetables() {
        this.vegetables.add(Vegetables.CUCUMBER);
        this.vegetables.add(Vegetables.CUCUMBER);
        this.vegetables.add(Vegetables.ONION);

    }

    @Override
    public void setSauce() {
        this.sauce.add(Sauce.MUSTARD);
        this.sauce.add(Sauce.KETCHUP);
    }

    @Override
    public void setDoubleCheese() {
        this.doubleCheese = Cheese.CHEDDAR;
    }

    @Override
    public void setExtraPatty() {
        this.extraPatty = Patty.NONE;
    }
}
