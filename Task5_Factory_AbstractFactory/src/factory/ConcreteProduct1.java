package factory;

class ConcreteProduct1 implements Product {
    @Override
    public void operation() {
        System.out.println("Operation from ConcreteProduct1");
    }
}