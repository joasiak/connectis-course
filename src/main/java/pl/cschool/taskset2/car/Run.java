package pl.cschool.taskset2.car;

public class Run {

    public static void main(String[] args) {

        Car myCar = new Car("Opel", "Insignia", 2017);
        Engine myEngine = new Engine(52, 5800, 3, 90);
        myCar.setEngine(myEngine);
        myCar.setNoOfSeats(5);
        myCar.setKmAge(65642);
        Wheel myWheel = new Wheel("alu", new Tire("Continental", 'W', 225, 17));
        myCar.setWheel(myWheel);


        Car carOne = new Car("Ford", "Fiesta", 2015);
        carOne.setEngine(new Engine(265, 6000, 4, 255));
        carOne.setWheel(new Wheel("alu",  new Tire("Goodyear", 'H', 195, 15)));


        myCar.drive();
        myCar.toDirection(Direction.LEFT);
        myCar.toDirection(Direction.GO_FORWARD);
        myCar.toDirection(Direction.RIGHT);
        myCar.park();
    }
}
