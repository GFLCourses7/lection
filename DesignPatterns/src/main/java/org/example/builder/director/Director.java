package org.example.builder.director;

import org.example.builder.builders.Builder;
import org.example.builder.entities.PizzaType;
import org.example.builder.entities.ingredients.*;

import java.util.List;

public class Director {

    public void buildHawaiianPizza(Builder builder) {
        builder.setPizzaType(PizzaType.HAWAIIAN);
        builder.setSize(30);
        builder.setDough(Dough.THIN_CRUST);
        builder.setSauce(Sauce.TOMATO);
        builder.setMeat(List.of(Meat.BACON));
        builder.setVegetables(List.of(Vegetables.PINEAPPLE));
        builder.setCheese(List.of(Cheese.MOZZARELLA));
    }

    public void buildVeganPizza(Builder builder) {
        builder.setPizzaType(PizzaType.VEGAN);
        builder.setSize(30);
        builder.setDough(Dough.THIN_CRUST);
        builder.setSauce(Sauce.TOMATO);
        builder.setCheese(List.of(Cheese.MOZZARELLA));
        builder.setVegetables(List.of(Vegetables.ONION, Vegetables.MUSHROOMS, Vegetables.PEPPER, Vegetables.CORN));
    }

    public void buildMeatLoversPizza(Builder builder) {
        builder.setPizzaType(PizzaType.MEAT_LOVERS);
        builder.setSize(40);
        builder.setDough(Dough.SAUSAGE_STUFFED_CRUST);
        builder.setSauce(Sauce.SPICY);
        builder.setMeat(List.of(Meat.PEPPERONI, Meat.BACON, Meat.CHICKEN, Meat.HAM));
        builder.setCheese(List.of(Cheese.PARMESAN));
        builder.setVegetables(List.of(Vegetables.ONION, Vegetables.TOMATO, Vegetables.PEPPER));
    }
}
