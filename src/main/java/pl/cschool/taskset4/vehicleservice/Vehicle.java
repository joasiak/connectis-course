package pl.cschool.taskset4.vehicleservice;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {

    private static int idNo=0;
    private int id;
    private MakeModelEnum model;
    private LocalDate produceDate;
    private LocalDate registerDate;

    private District district;

    public Vehicle(MakeModelEnum model, LocalDate produced, LocalDate registerDate, District district) {
        id=++idNo;
        this.model = model;
        this.produceDate = produced;
        this.registerDate = registerDate;
        this.district=district;
    }

    public Vehicle(int id, MakeModelEnum model, LocalDate produced,  LocalDate registerDate, District district) {
        this.id = id;
        this.model = model;
        this.produceDate = produced;
        this.registerDate = registerDate;
        this.district = district;
    }

    public abstract DrivingLicense requiredLicenseCategory();

    @Override
    public int compareTo(Vehicle o) {
        if (this.getProduceDate().getYear() - o.getProduceDate().getYear()!=0)
            return this.getProduceDate().getYear() - o.getProduceDate().getYear();
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

    public LocalDate getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(LocalDate produceDate) {
        this.produceDate = produceDate;
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
        return "Vehicle{" +
                "id=" + id +
                ", model=" + model +
                ", produceDate=" + produceDate +
                ", registerDate=" + registerDate +
                ", district=" + district +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id &&
                model == vehicle.model &&
                Objects.equals(produceDate, vehicle.produceDate) &&
                Objects.equals(registerDate, vehicle.registerDate) &&
                district == vehicle.district;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, model, produceDate, registerDate, district);
    }
}
