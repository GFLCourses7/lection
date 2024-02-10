package abstract_factory.factories;

import abstract_factory.model.examination.Examination;
import abstract_factory.model.examination.PsychiatristExamination;
import abstract_factory.model.survey.PsychiatristSurvey;
import abstract_factory.model.survey.Survey;
import abstract_factory.model.treatment.PsychiatristTreatment;
import abstract_factory.model.treatment.Treatment;

public class PsychiatristFactory implements CheckupFactory {
    @Override
    public Survey talkWithDoctor() {
        return new PsychiatristSurvey();
    }

    @Override
    public Examination examsByDoctor() {
        return new PsychiatristExamination();
    }

    @Override
    public Treatment treatByDoctor() {
        return new PsychiatristTreatment();
    }
}
