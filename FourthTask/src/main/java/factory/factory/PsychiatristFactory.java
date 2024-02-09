package factory.factory;

import factory.model.Doctor;
import factory.model.Psychiatrist;

public class PsychiatristFactory implements DoctorFactory{
    @Override
    public Doctor createDoctor() {
        return new Psychiatrist();
    }
}
