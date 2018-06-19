package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;

public class Motorcycle extends Vehicle {

    private int powerRPM;
    private int topSpeed;
    private int cylinders;

    public Motorcycle(MakeModelEnum model, LocalDate produced, District district) {
        super(model, produced, district);
    }
}
