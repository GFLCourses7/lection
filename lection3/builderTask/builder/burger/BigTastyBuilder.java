package builder.burger;

import components.*;

public class BigTastyBuilder extends AbstractBurgerBuilder {
    @Override
    public void setBunType() {
        this.bunType = BunType.BRIOCHE;
    }

    @Override
    public void setPatty() {
        this.patty = Patty.BEEF;
    }

    @Override
    public void setCheese() {
        this.cheese = Cheese.EMMENTAL;
    }

    @Override
    public void setSalad() {
        this.salad = "Crispy Lettuce";
    }

    @Override
    public void setVegetables() {
        this.vegetables.add(Vegetables.ONION);
        this.vegetables.add(Vegetables.TOMATO);
    }

    @Override
    public void setSauce() {
        this.sauce.add(Sauce.KETCHUP);
        this.sauce.add(Sauce.MAYO);
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
