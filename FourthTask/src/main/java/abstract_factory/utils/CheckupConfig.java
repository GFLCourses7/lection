package abstract_factory.utils;

import abstract_factory.Checkup;
import abstract_factory.factories.CheckupFactory;
import abstract_factory.factories.PsychiatristFactory;
import abstract_factory.factories.SurgeonFactory;
import abstract_factory.factories.TherapistFactory;

public class CheckupConfig {
    private static Checkup checkup;
    private static CheckupFactory checkupFactory;

    public static Checkup configureCheckup(String symptom) {
        if (symptom.equalsIgnoreCase("cough")) {
            checkupFactory = new TherapistFactory();
        } else if (symptom.equalsIgnoreCase("appendicitis")) {
            checkupFactory = new SurgeonFactory();
        } else if (symptom.equalsIgnoreCase("hallucinations")) {
            checkupFactory = new PsychiatristFactory();
        } else {
            throw new RuntimeException("Unknown symptom");
        }
        checkup = new Checkup(checkupFactory);
        return checkup;
    }
}
