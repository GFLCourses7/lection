package abstract_factory.factories;

import abstract_factory.model.examination.Examination;
import abstract_factory.model.survey.Survey;
import abstract_factory.model.treatment.Treatment;

public interface CheckupFactory {
    Survey talkWithDoctor();

    Examination examsByDoctor();

    Treatment treatByDoctor();
}
