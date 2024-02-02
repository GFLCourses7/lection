package builder.burger;

import components.Cheese;

public class DoubleCheeseBurgerBuilder extends CheeseBurgerBuilder {
    @Override
    public void setDoubleCheese() {
        this.doubleCheese = Cheese.CHEDDAR;
    }
}
