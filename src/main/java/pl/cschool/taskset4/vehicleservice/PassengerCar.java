package pl.cschool.taskset4.vehicleservice;

import pl.cschool.week4.Coder;

import java.time.LocalDate;

public class PassengerCar extends Vehicle {

    public PassengerCar(MakeModelEnum model, LocalDate produced, LocalDate registerDate, District district) {
        super(model, produced, registerDate, district);
    }

    public PassengerCar(int id, MakeModelEnum model, LocalDate produced, LocalDate registerDate, District district) {
        super(id, model, produced, registerDate, district);
    }

    @Override
    public DrivingLicense requiredLicenseCategory() {
        return DrivingLicense.Cat_B;
    }

}
