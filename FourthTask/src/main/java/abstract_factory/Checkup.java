package abstract_factory;

import abstract_factory.factories.CheckupFactory;
import abstract_factory.model.examination.Examination;
import abstract_factory.model.survey.Survey;
import abstract_factory.model.treatment.Treatment;

public class Checkup {
    private Survey survey;
    private Treatment treatment;
    private Examination examination;

    public Checkup(CheckupFactory checkupFactory) {
        survey = checkupFactory.talkWithDoctor();
        treatment = checkupFactory.treatByDoctor();
        examination = checkupFactory.examsByDoctor();
    }

    public void startCheckup() {
        survey.talkWithPatient();
        examination.conductAnExamination();
        treatment.treatThePatient();
    }
}
