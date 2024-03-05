package org.example.abstractfactory.model.orcs;

import org.example.abstractfactory.model.King;

public class OrcKing implements King {
    @Override
    public String getDescription() {
        return "This is the orcish king!";
    }
}
