package factory.factory;

import factory.model.Doctor;
import factory.model.Therapist;

public class TherapistFactory implements DoctorFactory{
    @Override
    public Doctor createDoctor() {
        return new Therapist();
    }
}
