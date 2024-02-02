package builder.menu;

import builder.item.Burger;
import builder.item.ItemBuilder;
import builder.item.Menu;
import components.Drink;
import components.Fries;

public abstract class AbstractMenuBuilder implements MenuBuilder, ItemBuilder<Menu> {
    protected Burger burger;
    protected Fries fries;
    protected Drink drink;
    protected Boolean toy;

    @Override
    public Menu getItem() {
        return new Menu(burger, fries, drink, toy);
    }

    @Override
    public abstract void setBurger();

    @Override
    public abstract void setFries();

    @Override
    public abstract void setDrink();

    @Override
    public abstract void setToy();

    @Override
    public void assembleItem() {
        setBurger();
        setFries();
        setDrink();
        setToy();
    }
}
