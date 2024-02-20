package abstractFactory;

class MageFactory implements GameFactory {
    @Override
    public Character createCharacter() {
        return new Mage();
    }

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }
}

