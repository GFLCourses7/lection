package builder.roll;

import components.*;

public class FishRollBuilder extends AbstractRollBuilder {
    @Override
    public void setBunType() {
        this.bunType = BunType.PITA;
    }

    @Override
    public void setPatty() {
        this.patty = Patty.FISH;
    }

    @Override
    public void setSalad() {
        this.salad = "Iceberg Lettuce";
    }

    @Override
    public void setVegetables() {
        this.vegetables.add(Vegetables.FRESH_CUCUMBER);
    }

    @Override
    public void setSauces() {
        this.sauces.add(Sauce.MAYO);
    }

    @Override
    public void setCheese() {
        this.cheese = Cheese.MONTEREY_JACK;
    }
}
