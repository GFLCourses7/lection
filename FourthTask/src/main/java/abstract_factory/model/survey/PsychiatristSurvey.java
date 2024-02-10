package abstract_factory.model.survey;

import abstract_factory.model.survey.Survey;

public class PsychiatristSurvey implements Survey {
    @Override
    public void talkWithPatient() {
        System.out.println("Lets talk about your childhood");
    }
}
