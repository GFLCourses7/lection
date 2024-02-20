package abstractFactory;

public class Main {
    public static void main(String[] args) {

        GameFactory warriorFactory = new WarriorFactory();

        Character warrior = warriorFactory.createCharacter();
        Weapon sword = warriorFactory.createWeapon();

        warrior.attack();
        sword.use();


        GameFactory mageFactory = new MageFactory();

        Character mage = mageFactory.createCharacter();
        Weapon staff = mageFactory.createWeapon();

        mage.attack();
        staff.use();
    }


}
