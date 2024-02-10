package abstract_factory.model.treatment;

public class TherapistTreatment implements Treatment {
    @Override
    public void treatThePatient() {
        System.out.println("Take more pills");
    }
}
