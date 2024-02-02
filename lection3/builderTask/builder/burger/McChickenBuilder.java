package builder.burger;

import components.BunType;
import components.Cheese;
import components.Patty;
import components.Sauce;

public class McChickenBuilder extends AbstractBurgerBuilder {
    @Override
    public void setBunType() {
        this.bunType = BunType.SESAME_SEED;
    }

    @Override
    public void setPatty() {
        this.patty = Patty.CHICKEN;
    }

    @Override
    public void setCheese() {
        this.cheese = Cheese.NONE;
    }

    @Override
    public void setSalad() {
        this.salad = "Shredded lettuce";
    }

    @Override
    public void setVegetables() {
    }

    @Override
    public void setSauce() {
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
