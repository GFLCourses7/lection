package builder.roll;

import builder.item.ItemBuilder;
import builder.item.Roll;
import components.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractRollBuilder implements RollBuilder, ItemBuilder<Roll> {
    protected BunType bunType;
    protected Patty patty;
    protected String salad;
    protected List<Vegetables> vegetables = new ArrayList<>();
    protected Set<Sauce> sauces = new HashSet<>();
    protected Cheese cheese;

    @Override
    public Roll getItem() {
        return new Roll(bunType, patty, salad, vegetables, sauces, cheese);
    }

    @Override
    public abstract void setBunType();

    @Override
    public abstract void setPatty();

    @Override
    public abstract void setSalad();

    @Override
    public abstract void setVegetables();

    @Override
    public abstract void setSauces();

    @Override
    public abstract void setCheese();

    @Override
    public void assembleItem() {
        setBunType();
        setPatty();
        setSalad();
        setVegetables();
        setSauces();
        setCheese();
    }
}
