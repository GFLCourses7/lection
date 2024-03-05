package org.example.abstractfactory;

import org.example.abstractfactory.factory.KingdomFactory;
import org.example.abstractfactory.model.Army;
import org.example.abstractfactory.model.Castle;
import org.example.abstractfactory.model.King;

public class Application {
    Castle castle;
    King king;
    Army army;

    public Application(KingdomFactory factory) {
        castle = factory.createCastle();
        king = factory.createKing();
        army = factory.createArmy();
    }

    public void print() {
        System.out.println(castle.getDescription() + "\n" +
                king.getDescription() + "\n" + army.getDescription());
    }
}
