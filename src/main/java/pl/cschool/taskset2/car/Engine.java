package pl.cschool.taskset2.car;

public class Engine {

    private EngineStatus engineStatus = EngineStatus.OFF;

    private int powerKW;
    private int powerRPM;
    private int topSpeed;
    private int cylinders;

    public Engine(int powerKW, int powerRPM, int cylinders, int topSpeed) {
        this.powerKW = powerKW;
        this.powerRPM = powerRPM;
        this.topSpeed = topSpeed;
        this.cylinders = cylinders;
    }

    public EngineStatus getEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(EngineStatus engineStatus) {
        this.engineStatus = engineStatus;
    }
}
