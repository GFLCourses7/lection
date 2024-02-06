package org.example.builder.builders;

import org.example.builder.entities.PizzaType;
import org.example.builder.entities.ingredients.*;

import java.util.List;

public interface Builder {
    void setPizzaType(PizzaType pizzaType);

    void setSize(int size);

    void setDough(Dough dough);

    void setSauce(Sauce sauce);

    void setMeat(List<Meat> meat);

    void setVegetables(List<Vegetables> vegetables);

    void setCheese(List<Cheese> cheese);
}
