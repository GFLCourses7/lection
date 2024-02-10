package abstract_factory.model.survey;

public class PsychiatristSurvey implements Survey {
    @Override
    public void talkWithPatient() {
        System.out.println("Lets talk about your childhood");
    }
}
