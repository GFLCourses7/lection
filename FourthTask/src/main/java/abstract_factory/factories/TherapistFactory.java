package abstract_factory.factories;

import abstract_factory.model.examination.Examination;
import abstract_factory.model.examination.TherapistExamination;
import abstract_factory.model.survey.Survey;
import abstract_factory.model.survey.TherapistSurvey;
import abstract_factory.model.treatment.TherapistTreatment;
import abstract_factory.model.treatment.Treatment;

public class TherapistFactory implements CheckupFactory{
    @Override
    public Survey talkWithDoctor() {
        return new TherapistSurvey();
    }

    @Override
    public Examination examsByDoctor() {
        return new TherapistExamination();
    }

    @Override
    public Treatment treatByDoctor() {
        return new TherapistTreatment();
    }
}
