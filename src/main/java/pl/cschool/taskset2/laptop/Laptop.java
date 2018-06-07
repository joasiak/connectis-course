package pl.cschool.taskset2.laptop;

public class Laptop {

    private String name;
    private String model;
    private double screen;
    private int ram;
    private String operatingSystem;
    private int hardDriveCapacity;
    private Processor processor;

    public Laptop(String name, String model, double screen) {
        this.name = name;
        this.model = model;
        this.screen = screen;
        System.out.println(this.toString());
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public void setHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    @Override
    public String toString() {
        return "Laptop " +
                 name +
                ", model: " + model +
                ", ekran " + screen +
                ", pamięć ram " + ram +
                ", dysk twardy " + hardDriveCapacity +
             //   ", processor " + processor.toString() +
                ", system operacyjny " + operatingSystem
                ;
    }
}
