package pl.cschool.taskset3.microwave;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OvenTest {

    @Test
    public void test1(){
        Oven myOven = new Oven();
        myOven.powerStatus=PowerStatus.OFF;
        assertEquals(PowerStatus.ON, myOven.turnOn());
        myOven.powerTimeTypeSetter(160, 30, OvenFunction.GRILL);
        assertEquals(OvenFunction.GRILL,myOven.getOvenFunctionStatus());
        assertEquals(PowerStatus.OFF, myOven.turnOff());
    }
}
