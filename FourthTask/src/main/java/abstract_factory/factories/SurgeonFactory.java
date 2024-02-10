package abstract_factory.factories;

import abstract_factory.model.examination.Examination;
import abstract_factory.model.examination.SurgeonExamination;
import abstract_factory.model.survey.SurgeonSurvey;
import abstract_factory.model.survey.Survey;
import abstract_factory.model.treatment.SurgeonTreatment;
import abstract_factory.model.treatment.Treatment;

public class SurgeonFactory implements CheckupFactory{
    @Override
    public Survey talkWithDoctor() {
        return new SurgeonSurvey();
    }

    @Override
    public Examination examsByDoctor() {
        return new SurgeonExamination();
    }

    @Override
    public Treatment treatByDoctor() {
        return new SurgeonTreatment();
    }
}
