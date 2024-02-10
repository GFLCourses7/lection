package abstract_factory.model.treatment;

public class PsychiatristTreatment implements Treatment {
    @Override
    public void treatThePatient() {
        System.out.println("We need more talking");
    }
}
