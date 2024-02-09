package factory.model;

public class Therapist implements Doctor{
    @Override
    public void treatThePatient() {
        System.out.println("Take the pill and get better");
    }
}
