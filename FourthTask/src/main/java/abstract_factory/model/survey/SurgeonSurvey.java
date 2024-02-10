package abstract_factory.model.survey;

public class SurgeonSurvey implements Survey {
    @Override
    public void talkWithPatient() {
        System.out.println("Ok what can I cutoff");
    }
}
