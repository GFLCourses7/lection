package abstract_factory.model.examination;

public class SurgeonExamination implements Examination {
    @Override
    public void conductAnExamination() {
        System.out.println("In that place we will cut");
    }
}
