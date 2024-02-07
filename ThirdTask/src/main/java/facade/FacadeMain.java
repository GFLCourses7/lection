package facade;

import facade.facade.DiagnosticsFacade;
import facade.model.Computer;

public class FacadeMain {
    public static void main(String[] args) {

        Computer computer = new Computer("Asus Gaming X-55", 88,45,2300000);
        DiagnosticsFacade diagnosticsFacade = new DiagnosticsFacade();
        diagnosticsFacade.startDiagnostics(computer);


    }
}
