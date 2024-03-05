package org.example.abstractfactory.factory;

import org.example.abstractfactory.model.Army;
import org.example.abstractfactory.model.Castle;
import org.example.abstractfactory.model.King;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
