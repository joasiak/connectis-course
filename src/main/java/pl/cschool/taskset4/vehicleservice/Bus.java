package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;

public class Bus extends Vehicle {

    public Bus(MakeModelEnum model, LocalDate produced, LocalDate registerDate, District district) {
        super(model, produced, registerDate, district);
    }

    @Override
    public DrivingLicense requiredLicenseCategory() {
        return DrivingLicense.Cat_D;
    }
}
