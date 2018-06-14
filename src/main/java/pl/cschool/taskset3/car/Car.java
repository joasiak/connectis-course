package pl.cschool.taskset3.car;

public class Car implements Comparable<Car> {

    private static int idNo=0;
    private int id;
    private String make;
    private int produceInYear;
    private District district;

    public Car(String make, int produceInYear, District district) {
        id=++idNo;
        this.make = make;
        this.produceInYear = produceInYear;
        this.district=district;
    }

    public Car(int id, String make, int produceInYear, District district) {
        this.id = id;
        this.make = make;
        this.produceInYear = produceInYear;
        this.district = district;
    }

    @Override
    public int compareTo(Car o) {
        return this.getProduceInYear()-o.getProduceInYear();
    }

    public int getId() {
        return id;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public int getProduceInYear() {
        return produceInYear;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return "Car{id: " + id + " " +
                 make + ": "
                 + produceInYear + " " + district +
                '}';
    }
}
