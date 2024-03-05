package org.example.abstractfactory.model.elfs;

import org.example.abstractfactory.model.Army;

public class ElfArmy implements Army {
    @Override
    public String getDescription() {
        return "This is the elven Army!";
    }
}
