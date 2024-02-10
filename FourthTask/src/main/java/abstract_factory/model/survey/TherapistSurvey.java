package abstract_factory.model.survey;

public class TherapistSurvey implements Survey {
    @Override
    public void talkWithPatient() {
        System.out.println("Tell me where it hurts");
    }
}
