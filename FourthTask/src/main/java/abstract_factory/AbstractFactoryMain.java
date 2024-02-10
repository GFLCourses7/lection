package abstract_factory;

import abstract_factory.utils.CheckupConfig;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Checkup checkup = CheckupConfig.configureCheckup("hallucinations");
        checkup.startCheckup();
    }



}
