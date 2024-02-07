package facade.facade;

import facade.model.Computer;
import facade.service.CPUService;
import facade.service.HDDService;
import facade.service.RAMService;

public class DiagnosticsFacade {

    private CPUService cpu;
    private RAMService ram;
    private HDDService hdd;

    public DiagnosticsFacade() {
        this.cpu = new CPUService();
        this.ram = new RAMService();
        this.hdd = new HDDService();
    }

    public void startDiagnostics(Computer computer) {
        System.out.println("Start diagnostics of " + computer.getModel());
        cpu.cpuTemperatureCheck(computer);
        ram.ramCheck(computer);
        hdd.hddCheck(computer);
    }
}
