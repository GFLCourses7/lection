package org.example.abstractfactory.model.elfs;

import org.example.abstractfactory.model.Castle;

public class ElfCastle implements Castle {
    @Override
    public String getDescription() {
        return "This is the elven castle!";
    }
}
