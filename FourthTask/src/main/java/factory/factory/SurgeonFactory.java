package factory.factory;

import factory.model.Doctor;
import factory.model.Surgeon;

public class SurgeonFactory implements DoctorFactory{
    @Override
    public Doctor createDoctor() {
        return new Surgeon();
    }
}
