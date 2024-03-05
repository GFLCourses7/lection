package org.example.abstractfactory.factory;

import org.example.abstractfactory.model.Army;
import org.example.abstractfactory.model.Castle;
import org.example.abstractfactory.model.King;
import org.example.abstractfactory.model.orcs.OrcArmy;
import org.example.abstractfactory.model.orcs.OrcCastle;
import org.example.abstractfactory.model.orcs.OrcKing;

public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
