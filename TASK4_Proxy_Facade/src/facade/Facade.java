package facade;

public class Facade {
    private SystemA systemA;
    private SystemB systemB;

    public Facade() {
        this.systemA = new SystemA();
        this.systemB = new SystemB();
    }

    public void operationAB() {
        systemA.operationA();
        systemB.operationB();
    }
}
