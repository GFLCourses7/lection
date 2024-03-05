package org.example.abstractfactory.model.orcs;

import org.example.abstractfactory.model.Army;

public class OrcArmy implements Army {
    @Override
    public String getDescription() {
        return "This is the orcish Army!";
    }
}
