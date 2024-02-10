package abstract_factory.model.examination;

import abstract_factory.model.examination.Examination;

public class SurgeonExamination implements Examination {
    @Override
    public void conductAnExamination() {
        System.out.println("In that place we will cut");
    }
}
