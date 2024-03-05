package org.example.abstractfactory.factory;

import org.example.abstractfactory.model.Army;
import org.example.abstractfactory.model.Castle;
import org.example.abstractfactory.model.King;
import org.example.abstractfactory.model.elfs.ElfArmy;
import org.example.abstractfactory.model.elfs.ElfCastle;
import org.example.abstractfactory.model.elfs.ElfKing;

public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
