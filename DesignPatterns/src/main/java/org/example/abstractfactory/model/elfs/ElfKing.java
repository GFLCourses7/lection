package org.example.abstractfactory.model.elfs;

import org.example.abstractfactory.model.King;

public class ElfKing implements King {
    @Override
    public String getDescription() {
        return "This is the elven king!";
    }
}
