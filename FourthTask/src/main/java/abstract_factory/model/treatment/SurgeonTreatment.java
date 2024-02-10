package abstract_factory.model.treatment;

public class SurgeonTreatment implements Treatment {
    @Override
    public void treatThePatient() {
        System.out.println("Woohoo let`s start cutting");
    }
}
