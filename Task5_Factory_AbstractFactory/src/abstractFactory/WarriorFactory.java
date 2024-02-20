package abstractFactory;

class WarriorFactory implements GameFactory {
    @Override
    public Character createCharacter() {
        return new Warrior();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
