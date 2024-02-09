package factory.model;

public class Surgeon implements Doctor{
    @Override
    public void treatThePatient() {
        System.out.println("Let`s cut something");
    }
}
