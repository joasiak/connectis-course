package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;

public class Truck extends Vehicle {

    public Truck(MakeModelEnum model, LocalDate produced, District district) {
        super(model, produced, district);
    }


}
