package builder.roll;

import components.*;

public class ChickenRollBuilder extends AbstractRollBuilder {
    @Override
    public void setBunType() {
        this.bunType = BunType.PITA;
    }

    @Override
    public void setPatty() {
        this.patty = Patty.CHICKEN;
    }

    @Override
    public void setSalad() {
        this.salad = "Crisp Lettuce";
    }

    @Override
    public void setVegetables() {
        this.vegetables.add(Vegetables.TOMATO);
    }

    @Override
    public void setSauces() {
        this.sauces.add(Sauce.HONEY);
        this.sauces.add(Sauce.MUSTARD);
    }

    @Override
    public void setCheese() {
        this.cheese = Cheese.CHEDDAR;
    }
}
