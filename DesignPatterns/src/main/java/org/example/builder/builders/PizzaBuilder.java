package org.example.builder.builders;

import org.example.builder.entities.Pizza;
import org.example.builder.entities.PizzaType;
import org.example.builder.entities.ingredients.*;

import java.util.List;

public class PizzaBuilder implements Builder {
    private PizzaType pizzaType;
    private int size;
    private Dough dough;
    private Sauce sauce;
    private List<Meat> meat;
    private List<Vegetables> vegetables;
    private List<Cheese> cheese;

    @Override
    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setMeat(List<Meat> meat) {
        this.meat = meat;
    }

    @Override
    public void setVegetables(List<Vegetables> vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public void setCheese(List<Cheese> cheese) {
        this.cheese = cheese;
    }

    public Pizza getPizza() {
        return new Pizza(pizzaType, size, dough, sauce, meat, vegetables, cheese);
    }
}
