package abstractFactory;

class Staff extends Weapon {
    @Override
    public void use() {
        System.out.println("Staff casts magic!");
    }
}
