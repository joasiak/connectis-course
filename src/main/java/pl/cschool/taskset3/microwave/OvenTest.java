package pl.cschool.taskset3.microwave;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OvenTest {

    @Test
    public void test1(){
        Oven myOven = new Oven();
        myOven.powerStatus=PowerStatus.OFF;
        assertEquals(PowerStatus.ON, myOven.turnOn());
        myOven.setTemperature(160);
        assertEquals(160,myOven.temperature);
        myOven.setTimer(30);
        assertEquals(30, myOven.minutes);
        assertEquals(PowerStatus.OFF, myOven.turnOff());
    }
}
