package abstract_factory.model.examination;

import abstract_factory.model.examination.Examination;

public class PsychiatristExamination implements Examination {
    @Override
    public void conductAnExamination() {
        System.out.println("Check your brain");
    }
}
