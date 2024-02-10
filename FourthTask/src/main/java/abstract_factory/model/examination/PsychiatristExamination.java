package abstract_factory.model.examination;

public class PsychiatristExamination implements Examination {
    @Override
    public void conductAnExamination() {
        System.out.println("Check your brain");
    }
}
