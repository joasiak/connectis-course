package pl.cschool.taskset2.car;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {


    Car myCar = new Car("Opel", "Insignia", 2017);
    Engine myEngine = new Engine(52, 5800, 3, 90);
    Wheel myWheel = new Wheel("alu", new Tire("Continental", 'W', 225, 17));

    @Test
    public void Test() {

        myCar.setEngine(myEngine);
        myCar.setNoOfSeats(5);
        myCar.setKmAge(65642);
        myCar.setWheel(myWheel);

        myCar.getEngine().setEngineStatus(EngineStatus.OFF);
        myCar.drive();
        assertEquals(EngineStatus.ON,myCar.getEngine().getEngineStatus());
        myCar.toDirection(Direction.LEFT);
        assertEquals(Direction.LEFT,myCar.getWheel().getDirectionStatus());
        myCar.park();
        assertEquals(EngineStatus.OFF,myCar.getEngine().getEngineStatus());

    }


}
