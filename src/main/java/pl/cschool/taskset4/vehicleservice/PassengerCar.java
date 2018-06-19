package pl.cschool.taskset4.vehicleservice;

import pl.cschool.week4.Coder;

import java.time.LocalDate;

public class PassengerCar extends Vehicle {

    private Color color;
    private int powerKW;

    public PassengerCar(MakeModelEnum model, LocalDate produced, District district) {
        super(model, produced, district);
    }

    public PassengerCar(int id, MakeModelEnum model, LocalDate produced, District district) {
        super(id, model, produced, district);
    }

    @Override
    public void specificationSetter() {

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPowerKW() {
        return powerKW;
    }

    public void setPowerKW(int powerKW) {
        this.powerKW = powerKW;
    }
}
