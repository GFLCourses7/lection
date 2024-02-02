package builder.burger;

import builder.item.Burger;
import builder.item.ItemBuilder;
import components.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractBurgerBuilder implements BurgerBuilder, ItemBuilder<Burger> {
    protected BunType bunType;
    protected Patty patty;
    protected Cheese cheese;
    protected String salad;
    protected List<Vegetables> vegetables = new ArrayList<>();
    protected Set<Sauce> sauce = new HashSet<>();
    protected Cheese doubleCheese;
    protected Patty extraPatty;

    @Override
    public Burger getItem() {
        return new Burger(bunType, patty, cheese, salad, vegetables, sauce, doubleCheese, extraPatty);
    }

    @Override
    public abstract void setBunType();

    @Override
    public abstract void setPatty();

    @Override
    public abstract void setCheese();

    @Override
    public abstract void setSalad();

    @Override
    public abstract void setVegetables();

    @Override
    public abstract void setSauce();

    @Override
    public abstract void setDoubleCheese();

    @Override
    public abstract void setExtraPatty();

    @Override
    public void assembleItem() {
        setBunType();
        setCheese();
        setPatty();
        setVegetables();
        setSalad();
        setSauce();
        setDoubleCheese();
        setExtraPatty();
    }

}
