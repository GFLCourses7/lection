package org.example.abstractfactory.model.orcs;

import org.example.abstractfactory.model.Castle;

public class OrcCastle implements Castle {
    @Override
    public String getDescription() {
        return "This is the orcish castle!";
    }
}
