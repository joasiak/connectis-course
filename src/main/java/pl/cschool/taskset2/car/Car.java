package pl.cschool.taskset2.car;

public class Car {

    private String make;
    private String model;
    private int year;
    private int noOfSeats;
    private int kmAge;
    private Engine engine;
    private Wheel wheel;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getKmAge() {
        return kmAge;
    }

    public void setKmAge(int kmAge) {
        this.kmAge = kmAge;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void drive() {
        engine.setEngineStatus(EngineStatus.ON);
        System.out.println("Silnik włączony");
        System.out.println("Samochód rusza.");
    }

    public void park() {
        System.out.println("Samochód zaparkował");
        engine.setEngineStatus(EngineStatus.OFF);
        System.out.println("Silnik wyłączony");
    }

    public void toDirection(Direction d) {
        wheel.setDirectionStatus(d);
        if (d==Direction.GO_FORWARD)
            System.out.println("Samochód jedzie prosto");
        else
            System.out.println("Samochód skęcił w " + d);
    }
}
