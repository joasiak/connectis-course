package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {

    private static int idNo=0;
    private int id;
    private MakeModelEnum model;
    private LocalDate producedIn;
    private LocalDate registerDate;

    private District district;

    public Vehicle(MakeModelEnum model, LocalDate produced, District district) {
        id=++idNo;
        this.model = model;
        this.producedIn = produced;
        this.district=district;
    }

    public Vehicle(int id, MakeModelEnum model, LocalDate produced, District district) {
        this.id = id;
        this.model = model;
        this.producedIn = produced;
        this.district = district;
    }

    public DrivingLicense licenseCategory(Vehicle v){
        if (v instanceof PassengerCar) return DrivingLicense.Cat_B;
        else if (v instanceof Bus) return DrivingLicense.Cat_D;
        else if (v instanceof Truck || v instanceof LGTruck) return DrivingLicense.Cat_C;
        else return DrivingLicense.Cat_A;
    }

    public void specificationSetter(){

    }


    @Override
    public int compareTo(Vehicle o) {
        if (this.getProducedIn().getYear() - o.getProducedIn().getYear()!=0)
            return this.getProducedIn().getYear() - o.getProducedIn().getYear();
        return this.id - o.id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MakeModelEnum getModel() {
        return model;
    }

    public void setModel(MakeModelEnum model) {
        this.model = model;
    }

    public LocalDate getProducedIn() {
        return producedIn;
    }

    public void setProducedIn(LocalDate producedIn) {
        this.producedIn = producedIn;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Vehicle{id: " + id + " " +
                model + ": "
                 + producedIn + " " + district +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id &&
                producedIn == vehicle.producedIn &&
                model == vehicle.model &&
                Objects.equals(registerDate, vehicle.registerDate) &&
                district == vehicle.district;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, model, producedIn, registerDate, district);
    }
}
