package builder.burger;

import components.Patty;

public class DoubleRoyalCheeseBurgerBuilder extends RoyalCheeseBurgerBuilder {
    @Override
    public void setExtraPatty() {
        this.extraPatty = Patty.BEEF;
    }
}
