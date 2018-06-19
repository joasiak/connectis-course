package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;

public class Bus extends Vehicle {

    public Bus(MakeModelEnum model, LocalDate produced, District district) {
        super(model, produced, district);
    }
}
