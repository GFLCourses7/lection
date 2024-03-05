package org.example.abstractfactory;

import org.example.abstractfactory.factory.ElfKingdomFactory;
import org.example.abstractfactory.factory.KingdomFactory;
import org.example.abstractfactory.factory.OrcKingdomFactory;
import org.example.abstractfactory.model.KingdomType;

public class Demo {
    private static Application createKingdom(KingdomType type) {
        KingdomFactory kingdomFactory = switch (type) {
            case ELF -> new ElfKingdomFactory();
            case ORC -> new OrcKingdomFactory();
        };

        return new Application(kingdomFactory);
    }

    public static void main(String[] args) {
        Application app = createKingdom(KingdomType.ELF);
        System.out.println("Elf Kingdom");
        app.print();

        Application app2 = createKingdom(KingdomType.ORC);
        System.out.println("Orc Kingdom");
        app2.print();
    }
}
