package org.example.builder.entities;

import org.example.builder.entities.ingredients.*;

import java.util.List;

public class Pizza {
    private PizzaType pizzaType;
    private int size;
    private Dough dough;
    private Sauce sauce;
    private List<Meat> meat;
    private List<Vegetables> vegetables;
    private List<Cheese> cheese;

    public Pizza(PizzaType pizzaType, int size, Dough dough, Sauce sauce, List<Meat> meat,
                 List<Vegetables> vegetables, List<Cheese> cheese) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.dough = dough;
        this.sauce = sauce;
        this.meat = meat;
        this.vegetables = vegetables;
        this.cheese = cheese;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Meat> getMeat() {
        return meat;
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    public List<Cheese> getCheese() {
        return cheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaType=" + pizzaType +
                ", size=" + size +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", meat=" + meat +
                ", vegetables=" + vegetables +
                ", cheese=" + cheese +
                '}';
    }
}
