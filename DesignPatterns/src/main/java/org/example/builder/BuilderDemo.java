package org.example.builder;

import org.example.builder.builders.PizzaBuilder;
import org.example.builder.director.Director;
import org.example.builder.entities.Pizza;

public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder builder = new PizzaBuilder();

        director.buildHawaiianPizza(builder);
        Pizza hawaiianPizza = builder.getPizza();

        System.out.println(hawaiianPizza);
        System.out.println("------------");

        director.buildVeganPizza(builder);
        Pizza veganPizza = builder.getPizza();

        System.out.println(veganPizza);
        System.out.println("------------");

        director.buildMeatLoversPizza(builder);
        Pizza meatLoversPizza = builder.getPizza();

        System.out.println(meatLoversPizza);
        System.out.println("------------");
    }
}
