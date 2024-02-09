package factory;

import factory.factory.DoctorFactory;
import factory.factory.PsychiatristFactory;
import factory.factory.SurgeonFactory;
import factory.factory.TherapistFactory;
import factory.model.Doctor;

public class FactoryMain {
    public static void main(String[] args) {
        DoctorFactory doctorFactory = createDoctorBySymptom("i see dead people");
        Doctor doctor = doctorFactory.createDoctor();
        doctor.treatThePatient();
    }

    static DoctorFactory createDoctorBySymptom(String symptom) {
        if (symptom.equalsIgnoreCase("headache")) {
            return new TherapistFactory();
        }
        if (symptom.equalsIgnoreCase("injury")) {
            return new SurgeonFactory();
        }
        if (symptom.equalsIgnoreCase("i see dead people")) {
            return new PsychiatristFactory();
        } else {
            throw new RuntimeException("Unknown symptom");
        }
    }
}
