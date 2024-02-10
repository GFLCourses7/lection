package abstract_factory.model.examination;


public class TherapistExamination implements Examination {
    @Override
    public void conductAnExamination() {
        System.out.println("Inhale than exhale");
    }
}
