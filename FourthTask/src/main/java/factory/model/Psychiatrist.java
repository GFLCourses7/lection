package factory.model;

public class Psychiatrist implements Doctor{
    @Override
    public void treatThePatient() {
        System.out.println("Let`s talk about it");
    }
}
