package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;

public class LGTruck extends Truck {

    public LGTruck(MakeModelEnum model, LocalDate produced, District district) {
        super(model, produced, district);
    }
}
